package W3resources_ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_To_Array {

	public static void main(String[] args) {
	
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(4);
		ar.add(1);
		ar.add(5);
		ar.add(47);
		ar.add(46);
		
		int a[]=new int[ar.size()];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=ar.get(i);
			
		}
System.out.println(ar);
System.out.println(Arrays.toString(a));
	}

}
