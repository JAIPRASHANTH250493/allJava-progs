package w3resoursesString_prgs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class s51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="w3resource";
		char c[]=s.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		
		for (char d : c) {
			
			if(h.containsKey(d)) {
				h.put(d, h.get(d)+1);
			}else {
				h.put(d, 1);
			}
		}
		System.out.println(h.entrySet());
		
		Set<Character> set=new HashSet<Character>();
		for (int i = 0; i < c.length; i++) {
			if(h.get(c[i])>1) {
				System.out.println(c[i]+"  appears "+" "+h.get(c[i])+""+" ties");
			}
		
		}
		
	}

}
