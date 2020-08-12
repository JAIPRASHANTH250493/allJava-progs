package w3resoses_arrays_progs;

public class a65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 2, -3, -4, 0, 6, 7, 8, 9};
		int lar=0;
		int large=0;


		for (int i = 0; i < a.length; i++) {

			lar=lar+a[i];
			lar=Integer.max(lar, 0);
			

		}
		System.out.println(lar);
	}

}
