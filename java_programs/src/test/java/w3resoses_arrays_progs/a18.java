package w3resoses_arrays_progs;

public class a18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,8,9,1,4,10};
		int n=Integer.MAX_VALUE;
		int n1=Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if(a[i]<n) {
				n1=n;
				n=a[i];
			}
			if(a[i]>n) {
				if(a[i]<n1) {
					n1=a[i];
				}
			}

		}
		System.out.println(n1);
	}

}
