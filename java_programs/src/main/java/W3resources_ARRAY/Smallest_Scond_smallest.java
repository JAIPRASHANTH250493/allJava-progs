package W3resources_ARRAY;

public class Smallest_Scond_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {55,23,8,11,10,7,100};
		
		int small=Integer.MAX_VALUE;
		int small1=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<small) {
				small1=small;
				small=a[i];
			}
			if(a[i]>small&&a[i]<small1) {
				small1=a[i];
			}
		}
		
		System.out.println(small);
		System.out.println(small1);
	}

}
