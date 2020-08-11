package W3resoursesArrays;

public class sumAll_Valuse_and_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6};
		int total=0;
		
		for (int i = 0; i < a.length; i++) {
			
			total=total+a[i];
		}
		System.out.println(total);
		
		
		float avg=total/(a.length);
		System.out.println(avg);
	}

	
}
