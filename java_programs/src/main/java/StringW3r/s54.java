package StringW3r;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class s54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="wetnnfonsntwncenfr";
String find="tower";

Set<Character> se=new TreeSet<Character>();
Set<Character> s1=new TreeSet<Character>();

for (int i = 0; i < s.length(); i++) {
	
	se.add(s.charAt(i));
}

for (int i = 0; i < find.length(); i++) {
	
	s1.add(s.charAt(i));
}
System.out.println(se);
System.out.println(s1);
System.out.println();

	}

}
