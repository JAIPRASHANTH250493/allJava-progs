package w3resoses_arrays_progs;

public class a36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,5,6};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int k = i+1; k < a.length; k++) {
				
				if(Math.abs(a[i]+a[k])==6) {
					System.out.println("no are  "+a[i]+" "+a[k]);
				}
			}
		}
	}

}
