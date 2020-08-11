package W3resources_ARRAY;

public class math_abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,5,7,10,45,49};
		
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
