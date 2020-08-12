package w3resoses_arrays_progs;

import java.util.Arrays;

public class a66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
		Arrays.sort(s);
		int tiny=Integer.MAX_VALUE;

		for (int i = 0; i < s.length; i++) {
			for (int k = i+1; k < s.length; k++) {

			if(Math.abs(s[i]-s[k])==10) {
				tiny=Math.abs(s[i]-s[k]);
				System.out.println(s[i]+""+s[k]);
			}
		}
		
	}
		
	}

}
