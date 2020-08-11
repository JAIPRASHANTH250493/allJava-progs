package W3resources_ARRAY;

public class minimum_difference_betweenintergerARRAY{

	public static void main(String[] args) {
		
		int a[]= {2,5,8,1,8,10,22};
		int b[]= {2,54,8,17,9,10,42};
		
		int small=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			
			if(Math.abs(a[i]-b[i])<small) {
				small=Math.abs(a[i]-b[i]);
			}
		}
		System.out.println(small);
		
		

}}
