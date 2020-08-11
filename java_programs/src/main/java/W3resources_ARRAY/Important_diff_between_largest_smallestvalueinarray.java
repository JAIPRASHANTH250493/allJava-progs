package W3resources_ARRAY;

public class Important_diff_between_largest_smallestvalueinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,8,100,50,40,25};
		
		int small=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(Math.abs(a[i]-a[j])<small) {
					small=Math.abs(a[i]-a[j]);
				}
				
			}
		}
		System.out.println(small);
	}

}
