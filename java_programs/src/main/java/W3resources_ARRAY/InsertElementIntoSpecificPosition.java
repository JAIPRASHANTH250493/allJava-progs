package W3resources_ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElementIntoSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5,6};
		int b=4;
		ArrayList<Integer> in=new ArrayList<Integer>();

		for(int i=0;i<a.length;i++) {
			in.add(a[i]);
		}
		System.out.println(in);
		in.add(3, b);
		System.out.println(in);
		
		a[3]=90;
		System.out.println(Arrays.toString(a));
	}

}
