package w3resoses_arrays_progs;

public class a32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,5,65,34};
		int c=0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==65) {
				c++;
			}
			if(a[i]==90) {
				c++;
			}
			
		}
		if(c==2) {
			System.out.println("both present ");
		}else {
			System.out.println("not prsent");
		}
	}

}
