package w3resoses_arrays_progs;

public class s29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a[]= {2,3,5,4,10};
		
		int big=0;
		int tiny=Integer.MAX_VALUE;
		int t=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>big) {
				big=a[i];
			}
			if(a[i]<tiny) {
				tiny=a[i];
			}
			
			t=t+a[i];
		}
		System.out.println(t);
		
		int avg=(t-big-tiny)/(a.length-2);
		System.out.println(avg);
	}

}
