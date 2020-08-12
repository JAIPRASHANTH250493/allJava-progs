package w3resoses_arrays_progs;

public class a25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 4, 8};
		   int b[] = {2, 3, 4, 8, 10, 16};
		   int c[] = {4, 8, 14, 40};
		   
		   for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < b.length; k++) {
				for (int l = 0; l < c.length; l++) {
					if(a[i]==b[k]) {
						if(b[k]==c[l]) {
							
							System.out.println("co eleents are  "+a[i]);
						}
						
					}
				}
			}
		}
	}

}
