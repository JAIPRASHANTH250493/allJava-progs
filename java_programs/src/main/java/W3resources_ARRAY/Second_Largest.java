package W3resources_ARRAY;

public class Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,6,7,33,6,98,99,99,1,100,101,88876};
		int num1=0;
		int num2=0;
		int num3=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>num1) {
				
				num2=num1;
				num1=a[i];
			}
			
			if(a[i]<num1&&a[i]>num2) {
				num2=a[i];
			}
		}
		System.out.println(num2);
		}
	}


