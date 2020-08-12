package w3resoses_arrays_progs;

public class a39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {2,5,4,8,9,4,6,4,6,2};
		int t=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int k = i+1; k < a.length; k++) {
				if(a[i]>t) {
					t=a[i];					
				}
			}
		}
		System.out.println(t+" "+"is the leader");
	}
}
