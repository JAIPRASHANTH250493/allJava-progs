package w3resoursesString_prgs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class s43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aiitttttlldccndt";
		
		char c[]=s.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		
		for (int i = 0; i < c.length; i++) {
			if(h.containsKey(c[i])) {
				h.put(c[i], h.get(c[i])+1);
			}
			else {
				h.put(c[i], 1);
			}
		}
		
		Set<Entry<Character, Integer>> set=	h.entrySet();
		
		int ax=Integer.MIN_VALUE;
		char c1=' ';
		for (Entry<Character, Integer> entry : set) {
			
			if(entry.getValue()>ax) {
				ax=entry.getValue();
				 c1=entry.getKey();
				
			}
			
		}
		System.out.println(c1);
	}

}
