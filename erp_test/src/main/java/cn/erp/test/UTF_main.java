package cn.erp.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Administrator
 *
 */
public class UTF_main {
 
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\Administrator\\Desktop\\ERP\\erp_parent");//��Ҫת���GBK��ʽ�ļ���
		File f2 = new File("C:\\Users\\Administrator\\Desktop\\ERP\\erp_parent");//ת���UTF-8��Ŀ���ļ���
		try {
			new UTF_main().copyFile(f1, f2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void copyFile(File f1, File f2) throws FileNotFoundException, IOException {
		if(f1.isDirectory()) {
			f2.mkdir();
			File[] fs = f1 .listFiles();
			for (File subF : fs) {
				//�ݹ����Ŀ¼
				copyFile(subF, new File(f2, subF.getName()));
			}
		} else if (f1.isFile() && f1.getName().endsWith(".java")) {
			//��java�ļ�����ת��
			parse2UTF_8(f1, f2);
		} else {
			//�Է�java�ļ�ֱ�Ӹ���
			copyData(f1, f2);
		}
	}
	
	//�����ļ�
	private void copyData(File f1, File f2) throws FileNotFoundException, IOException{
		
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2, false);
		
		byte[] bytes = new byte[1024];
		int temp = 0;
		while (-1 != (temp = fis.read(bytes))) {
			fos.write(bytes, 0, temp);
		}
		
		fos.flush();
		
		if(null != fis) {
			fis.close();
		}
		if(null != fos) {
			fos.close();
		}
	}
	
	/*
	 * �÷������� �ܿ�˼��(Jacksile)�����£�Eclipse�޸ı����������
	 * 	֮������С�޸�
	 * ԭ���ַ http://www.cnblogs.com/tufujie/p/5137564.html
	 */
	private void parse2UTF_8(File file, File destFile) throws IOException {
        StringBuffer msg = new StringBuffer();
        // ��д����
        PrintWriter ps = new PrintWriter(new OutputStreamWriter(new FileOutputStream(destFile.getAbsolutePath(), false), "utf8"));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "gbk"));
 
        // ��д����
        String line = br.readLine();
        while (line != null) {
            msg.append(line).append("\r\n");
            line = br.readLine();
        }
        ps.write(msg.toString());
        br.close();
        ps.flush();
        ps.close();
    }

}