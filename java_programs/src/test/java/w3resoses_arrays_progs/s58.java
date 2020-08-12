package w3resoses_arrays_progs;

import java.util.Arrays;

public class s58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 1, 5, 6, 7, 8, 10 };
		int[] B = { 2, 4, 9 };

		int[] c= new int[A.length+B.length];

		for (int k = 0; k < A.length; k++) {
			c[k]=A[k];
		}
		System.out.println(Arrays.toString(c));
		for (int l = A.length; l < A.length+B.length; l++) {
			c[l]=B[l];

		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		for (int k = 0; k < A.length; k++) {
			A[k]=c[k];
		}
		for (int k = A.length; k < A.length+B.length; k++) {
			B[k]=c[k];
		}

	}

}
