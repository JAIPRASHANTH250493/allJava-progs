package W3resoursesArrays;

import java.util.ArrayList;

public class Array_indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,6,7,8,44,6,4};
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==44) {
				System.out.println("indexof number is   "+i);
			}if(a[i]!=1) {
				ar.add(a[i]);
			}
		}
	int indexof=	ar.indexOf(6);
	int index=ar.lastIndexOf(4);
	System.out.println(indexof+" "+index);
		
	}

}
