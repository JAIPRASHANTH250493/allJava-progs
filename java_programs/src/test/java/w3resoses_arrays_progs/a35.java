package w3resoses_arrays_progs;

public class a35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1, -2, 0, 5, -1, -4};

		for (int i = 0; i < a.length; i++) {

			for (int k = i+1; k < a.length; k++) {
				for (int l = k+1; l < a.length; l++) {


					if(Math.abs(a[i]+a[k]+a[l])==2) {
						System.out.println("no are  "+a[i]+" "+a[k]+" "+a[l]);
					}
				}
			}
		}
	}

}
