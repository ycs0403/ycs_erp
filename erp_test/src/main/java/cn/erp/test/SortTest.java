package cn.erp.test;


public class SortTest {

	/* 
	 * 冒泡排序 
	 * 外层循环-1，内层循环-i-1，两循环相比，小靠前
	 * */
	public void sort() {
		int a[] = {2,9,6,4,3,1};

		int temp,i,j;
		for(i=0;i<6-1;i++) {
			for(j=0;j<6-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<6;i++) {
			System.out.println(a[i]);
		}
	}

	
	/**   
	 * ++a和a++
	 * ++a是:1+a
	 * a++是:a+a
	 */  
	public void plus() {
		Integer a=0;
		int b=0;
		//a = ++a;
		a=a++;
		//b=++b;
		//b=b++;
		System.out.println(a);
		System.out.println(b);
	}

}

