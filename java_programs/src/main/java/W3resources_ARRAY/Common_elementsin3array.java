package W3resources_ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

public class Common_elementsin3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]= {16,2,3,4,5,7,15};
		int a[]= {15,2,9,4,5,7,4};
		int c[]= {11,2,15,4,0,7,16};
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		ArrayList<Integer> ar=new ArrayList<Integer>();

		int x=0,y=0,z=0;
		
		while(x<a.length&&y<b.length&&z<c.length) {
			if(a[x]==b[y]&&b[y]==c[z]) {
				ar.add(a[x]);
				x++;y++;z++;
				
			}
			
		}
System.out.println(ar);
	}

}
