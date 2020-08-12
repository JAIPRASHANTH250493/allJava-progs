package w3resoses_arrays_progs;

public class s28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,5,4,10};
		
		int big=0;
		int tiny=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>big) {
				big=a[i];
			}
			if(a[i]<tiny) {
				tiny=a[i];
			}
		}
		System.out.println(big);
		System.out.println(tiny);
		System.out.println(big-tiny);
	}

}
