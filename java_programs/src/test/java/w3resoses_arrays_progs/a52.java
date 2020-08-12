package w3resoses_arrays_progs;

import java.util.Arrays;

public class a52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,3,4,5,6,9,11,22,23,25};
		
		int t=0;
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a.length; k++) {
				if(a[k]%2!=0) {
					t=a[i];
					a[i]=a[k];
					a[k]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
