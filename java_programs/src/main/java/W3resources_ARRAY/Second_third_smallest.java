package W3resources_ARRAY;

public class Second_third_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {22,6,7,33,6,98,99,99,111,100,101,88876};
		int num1=99999999,num2=0,num3=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<num1) {
				num3=num2;
				num2=num1;
				num1=a[i];
			}
			if(a[i]>num1&&a[i]<num2) {
				num3=num2;
				num2=a[i];
			}
			if(a[i]>num1&&a[i]>num2&&a[i]<num3) {
				num3=a[i];
			}
			
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}
