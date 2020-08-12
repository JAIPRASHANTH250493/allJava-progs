package w3resoses_arrays_progs;

import java.util.Arrays;

public class a6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= { 1, 3, 2, 7, 5, 6, 4, 8};

Arrays.sort(a);
//Math.abs

for (int i = 0; i < a.length-1; i++) {
	if(Math.abs(a[i]-a[i+1])==1) {
		
		System.out.print(a[i]);
	}
}
	}

}
