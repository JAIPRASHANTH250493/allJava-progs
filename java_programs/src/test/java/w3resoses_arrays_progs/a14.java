package w3resoses_arrays_progs;

public class a14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,5,6,2,3,9,10,4,5};
		int b[]= {4,2,10,222,44,1,2};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println("sae eleent is   "+a[i]);
				}
			}
		}
	}

}
