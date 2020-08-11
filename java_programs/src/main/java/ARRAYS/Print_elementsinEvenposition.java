package ARRAYS;

import java.util.ArrayList;

public class Print_elementsinEvenposition {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("1");
		ar.add("2");
		ar.add("3");
		ar.add("4");
		ar.add("5");
		ar.add("6");
		ar.add("7");
		ar.add("8");
		int c=0;
		
		for(int i=0;i<ar.size();i++) {
			
			
			c++;
			if(c%2==0) {
				System.out.println(ar.get(i));
			}
		}
	}

}
