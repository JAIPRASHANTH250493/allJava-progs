package w3resoses_arrays_progs;

public class a10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {6,8,9,11,12,15,14,1,22};
		
		int n=Integer.MIN_VALUE;
		int n1=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>n) {
				n1=n;
				n=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]<n1) {
				n1=a[i];
			}
		}
		System.out.println(n+" "+n1);
	}

}
