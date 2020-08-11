package W3resources_ARRAY;

import java.util.ArrayList;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7};
		
		int big=Integer.MIN_VALUE;
		int total=1;
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		
		for (int i = 0; i < a.length; i++) {
			
			
			for (int j = i+1; j < a.length; j++) {
				
				total=total*(a[i]*a[j]);
				
				
			}
			ar.add(total);
		
			
			
		}System.out.println(ar);
	}

}
