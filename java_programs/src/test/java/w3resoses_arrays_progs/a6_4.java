package w3resoses_arrays_progs;

public class a6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= { 1, 6, 3, 0, 8, 4, 1, 7 };
		int n=7;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int k = i+1; k < a.length; k++) {
				
				for (int l = k+1; l < a.length; l++) {
					
					if(a[i]+a[k]+a[l]==n) {
						System.out.println("sofgibben b are "+a[i]+" "+a[k]+" "+a[l]);
					}
				}
			}
			
		}

	}

}
