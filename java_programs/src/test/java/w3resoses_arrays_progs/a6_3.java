package w3resoses_arrays_progs;

import java.util.Arrays;

public class a6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {3, 5,-1,93, 6, 9, 8, 7};
		int b[]= {5, 0, 1, 2, 3, 4, -2};
		
		int t=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int k = i+1; k < a.length; k++) {
				if(a[i]>a[k]) {
					t=a[i];
					a[i]=a[k];
					a[k]=t;
					
				}
			}
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
