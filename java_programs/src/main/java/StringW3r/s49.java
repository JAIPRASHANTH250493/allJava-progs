package StringW3r;

import java.util.HashMap;

public class s49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="godisgooggd";
		char c[]=s.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for (char d : c) {
			if(h.containsKey(d)) {
				h.put(d, h.get(d)+1);
			}else {
				h.put(d,1);
			}
			
		}
		System.out.println(h);
		for (int i = 0; i < c.length; i++) {
			if(h.get(c[i])==1) {
				System.out.println("non repaeted is"+c[i]);
			}
		}
		
	}

}
