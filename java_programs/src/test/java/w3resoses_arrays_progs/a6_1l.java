package w3resoses_arrays_progs;

import java.util.Arrays;

public class a6_1l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		
		int toreect=2;
		
		for (int i = toreect; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		
		System.out.println(Arrays.toString(a));
	}

}
