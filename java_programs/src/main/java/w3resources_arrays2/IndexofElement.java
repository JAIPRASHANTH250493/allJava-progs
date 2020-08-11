package w3resources_arrays2;

import java.util.ArrayList;

public class IndexofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar=new ArrayList<Integer>();

int a[]= {1,2,3,4,5};
		
		int len=a.length;
		int total=0;
		for (int i = 0; i < a.length; i++) {
			
			ar.add(a[i]);
			
		
			
		}
		int in=	ar.indexOf(4);
		System.out.println(in);
		
		ar.remove(2);
	}

}
