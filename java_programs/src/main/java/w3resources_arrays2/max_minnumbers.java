package w3resources_arrays2;

public class max_minnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,5,6,2,5,7,5,6};
		
	int small=Integer.MAX_VALUE;
	int small1=Integer.MAX_VALUE;
	int big=Integer.MIN_VALUE;
	int big2=Integer.MIN_VALUE;
	int big3=Integer.MIN_VALUE;
			for (int i = 0; i < a.length; i++) {
				if(a[i]<small) {
					small=a[i];
				}
				if(a[i]>small&&a[i]<small1) {
					small1=a[i];
				}
					
			}			
			System.out.println(small+" "+small1);
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]>big) {
					big=a[i];
				}
				if(a[i]<big&&a[i]>big2) {
					big2=a[i];
				}
					
			}			
			System.out.println(big+" "+big2);
	}

}
