package W3resources_ARRAY;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,5,8,100,23,55,4};
		
		for(int i=a.length-1;i>0;i--) {
			System.out.println(a[i]);
		}
		ArrayList<Integer> in=new ArrayList<Integer>();
		for (Integer integer : a) {
			in.add(integer);
		}
		System.out.println(in);
		
		
	ListIterator<Integer> it=	in.listIterator();

	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}
	}

}
