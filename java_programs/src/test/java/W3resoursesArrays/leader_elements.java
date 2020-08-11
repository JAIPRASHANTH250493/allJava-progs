package W3resoursesArrays;

import java.util.Arrays;

public class leader_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,5,6,7,1,2,3,4,5};
		int leader=a[1];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>leader) {
				leader=a[i];
			}
			
		}
		System.out.println(leader);
		
		int b[]= {5,7,9,11,13};
		int t=0;
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length; i++) {
			
		t=	b[i];
	
		b[i]=t+1;
		System.out.println(b[i]);
		
		}
		System.out.println(Arrays.toString(b));
	}

}
