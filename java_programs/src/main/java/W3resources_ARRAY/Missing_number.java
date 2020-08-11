package W3resources_ARRAY;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,6,8,12};
		int b[]= {1,2,3,4,5,7};
		int total1=7*(7/2);
		int total=0;
		
		for (int i = 0; i < b.length; i++) {
			total=total+b[i];
			
		}
		
		System.out.println(total-total1);
		
	}

}
