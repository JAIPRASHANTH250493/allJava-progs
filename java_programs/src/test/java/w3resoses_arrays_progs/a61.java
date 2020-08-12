package w3resoses_arrays_progs;

import java.util.Arrays;

public class a61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
		int t=0;
		int ta=0;

		for (int i = 1; i < a.length-1; i+=2) {
			if(a[i-1]<a[i]) {

				
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
		}
			
		}
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1]) {
				ta=a[i];
				a[i]=a[i+1];
				a[i+1]=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
