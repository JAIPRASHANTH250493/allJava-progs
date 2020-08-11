package W3resources_ARRAY;

public class minimum_Integer_difference_inArray {

	public static void main(String[] args) {
		
		int a[]= {5,7,9,1,13,12};
		
		int small=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(Math.abs(a[i]-a[j])<small) {
					small=Math.abs(a[i]-a[j]);
				}
			}
		}
		System.out.println(small);

	}

}
