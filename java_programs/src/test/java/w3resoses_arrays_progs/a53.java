package w3resoses_arrays_progs;

import java.util.Arrays;

public class a53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,6,8,9,10,22};
		
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]+1;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
