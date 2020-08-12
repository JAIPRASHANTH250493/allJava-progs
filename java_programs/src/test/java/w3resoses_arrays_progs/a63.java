package w3resoses_arrays_progs;

import java.util.Arrays;

public class a63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1, 2, 3, 4, 5, 6, 7};
		int b[]=new int[a.length];

		for (int i =0; i<a.length; i++) {
			for (int k = i+1; k < a.length; k++) {
				a[i]=a[k]*a[i];
			}
		}

		System.out.println(Arrays.toString(a));
	}

}
