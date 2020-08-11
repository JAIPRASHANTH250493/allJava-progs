package ARRAYS;

import java.util.*;

public class duplicateinArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("jai");
		ar.add("ab");
		ar.add("jai");
		ar.add("helo");
		ar.add("bc");
		ar.add("ab");

		HashSet<String>s=new HashSet<String>();

		for (String string : ar) {

			if(s.add(string)==false) {
				System.out.println("duplicat is present"+ string);
			}
		}
		System.out.println(s);
	}

}
