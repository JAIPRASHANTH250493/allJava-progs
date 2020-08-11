package W3resources_ARRAY;

public class MaximumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,5,7,-7,5,8,5};
		
		int big=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
			
			
			if((a[i]*a[j])>big) {
				big=a[i]*a[j];
			}}
		}System.out.println(big);
	}

}
