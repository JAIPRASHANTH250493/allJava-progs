package ARRAYS;

public class Second_And_Third_LargestNUmber {

	public static void main(String[] args) {
		
		int a[]= {5,2,5,6,8,9,1,10,16,16,26,67};
		
int num1=0;
int num2=0;
int num3=0;

for(int i=0;i<a.length;i++) {
	if(a[i]>num1) {
		num2=num1;
		num1=a[i];
		
	}
	if(a[i]<num1&&a[i]>num2) {
		num3=num2;
		num2=a[i];
	}
	if(a[i]<num1&&a[i]<num2&&a[i]>num3) {
		num3=a[i];
	}
}
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
	}

}
