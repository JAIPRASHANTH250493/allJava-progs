package w3resoses_arrays_progs;

import java.util.Arrays;

public class a45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50};
		
		int l=a.length;
		
		for (int i = a.length-1; i>0; i--) {
			a[i]=a[i-1];
			
		}
		a[0]=a[l-1];
		
		System.out.println(Arrays.toString(a));
	}

}
