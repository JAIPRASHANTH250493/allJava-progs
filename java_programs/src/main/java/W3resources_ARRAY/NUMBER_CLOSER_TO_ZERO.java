package W3resources_ARRAY;

public class NUMBER_CLOSER_TO_ZERO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,5,-5,11,65,8};
		
		int small=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(Math.abs(a[i]-a[j])<small) {
					small=Math.abs(a[i]-a[j]);
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		if(small<=2) {
		System.out.println(small);
		}
	}

}
