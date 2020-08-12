package w3resoses_arrays_progs;

public class s54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= { 1, 3, -6, 3, 2, 3, 1, -3, -2, -2 };
		int t=0;
		
		for (int i = 0; i < a.length; i++) {
			t=t+a[i];
			if(t==0) {
				for (int k = 0; k < i; k++) {
					System.out.print(a[k]);
				}
				System.out.println("yes it has sof zero");
			}
			
		}
	}

}
