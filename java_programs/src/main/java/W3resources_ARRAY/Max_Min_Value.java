package W3resources_ARRAY;

public class Max_Min_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,5,8,100,23,55,4};
		
		int Minnum1=Integer.MAX_VALUE;
		int num2=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
		if(a[i]<Minnum1) {
		Minnum1=a[i];
		}
		if(a[i]>num2) {
			num2=a[i];
		}
		}
		System.out.println(Minnum1);
		System.out.println(num2);
	}

}
