package w3resoses_arrays_progs;

public class a55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, -3, 4, 5, 6 };
		
		int t=0;
		
		for (int i = 0; i < a.length; i++) {
			
			t=t+a[i];
			
			if(t==0) {
				for (int k = 0; k <=i ; k++) {
					System.out.print(a[k]+" ");
				}
			}
		}
	}
	

}
