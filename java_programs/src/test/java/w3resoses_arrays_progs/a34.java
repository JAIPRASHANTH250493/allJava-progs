package w3resoses_arrays_progs;

import java.util.Arrays;

public class a34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {61,62,63,66,68,68};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			
			if(Math.abs(a[i]-a[i+1])!=1){
				
				for (int k = 0; k <=i; k++) {
					System.out.print(a[k]);
					
				}
				break;
			}
		}
	
	}

}
