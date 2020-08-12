package w3resoses_arrays_progs;

import java.util.Arrays;

public class s6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1, 2,9, 3, 0, 4,4, 6};

Arrays.parallelSort(a);
for (int i = a.length-1; i>=0; i--) {
	System.out.print(a[i]);
}
	}

}
