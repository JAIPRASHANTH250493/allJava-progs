package String_Programs;

import java.util.HashSet;
import java.util.Set;

public class Duplicates_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="jjaaiipprraasshhaanntthh";
		char ch[]=given.toCharArray();
		Set<Character> s=new HashSet<Character>();
		for (Character c : ch) {
			if(s.add(c)==false) {
				System.out.println("duplicate is present"+"  "+c);
			}
		}
		System.out.println(s);
	}

}
