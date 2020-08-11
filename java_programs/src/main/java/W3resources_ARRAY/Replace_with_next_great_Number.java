package W3resources_ARRAY;

import java.util.Arrays;

public class Replace_with_next_great_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,20,6,15,2,1,7};
		int len=a.length;
				
		
		int last=a[a.length-1];
		
		for (int i = len-2; i>=0; i--) {
			
			if(a[i]<last) {
				a[i]=last;
			}
			else {
				last=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
