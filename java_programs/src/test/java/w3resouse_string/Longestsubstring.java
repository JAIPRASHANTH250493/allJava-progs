package w3resouse_string;

import java.util.HashSet;
import java.util.Set;

public class Longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="pickoutthelongestsubstring";
		int l=s.length();
		Set<Character> s1=new HashSet<Character>();
		int maxlength=0;
		int i=0,j=0;
		char[] c=s.toCharArray();
		String con="";
		
		while(i<l&& j<l){
			if(!s1.contains(c[j])) {
			s1.add(c[j]);
			maxlength=Math.max(maxlength,j-i);
				j++;
			}
			else {
				s1.remove(c[j]);
				i++;
			}
	}
System.out.println(maxlength);
}}
