package w3resouse_string;

import java.util.Iterator;

public class Removespcifchar103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdefabcdeabcdaaa";
		
		char c='a';
		
		char s1[]=s.toCharArray();
		for (char d : s1) {
			if(d!=c) {
				System.out.print(d);
			}
		}
	}

}
