package w3resoursesString_prgs;

import java.util.HashSet;
import java.util.Set;

public class s36_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="pickoutthelongestsubstring";
char c[]=s.toCharArray();

Set<Character> s1=new HashSet<Character>();
for (int i = 0; i < c.length; i++) {
	
	s1.add(c[i]);
}
System.out.println(s1.size());

	}

}
