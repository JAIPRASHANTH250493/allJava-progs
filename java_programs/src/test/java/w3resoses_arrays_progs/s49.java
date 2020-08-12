package w3resoses_arrays_progs;

import java.util.Arrays;

public class s49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,-2,3,-4,5,-6};
		int t=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int k = i+1;  k< a.length; k++) {
				if(a[i]>0) {
					t=a[i];
					a[i]=a[k];
					a[k]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
