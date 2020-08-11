package W3resoursesArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_into_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar=new ArrayList<Integer>();

	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	
	int a[]=new int[ar.size()];
	for (int i = 0; i < ar.size(); i++) {
		a[i]=ar.get(i);
	}
	System.out.println(ar);
	
System.out.println(Arrays.toString(a));
	}

}
