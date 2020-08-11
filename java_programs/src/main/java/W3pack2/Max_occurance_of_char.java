package W3pack2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Max_occurance_of_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="test stringggzoxa";
		char c[]=s.toCharArray();
		int co=0;
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for (char d : c) {
			if(h.containsKey(d)) {
				h.put(d, h.get(d)+1);
			}else {
				h.put(d,1);
			}
			
		}
		System.out.println(h);
		char key=' ';
		
		 Set<Entry<Character, Integer>> e=h.entrySet();
		 for (Entry<Character, Integer> entry : e) {
			if(entry.getValue()>co) {
				co=entry.getValue();
				key=entry.getKey();
			}
		}
		 System.out.println(co+""+key);
		
		
		}
	
		
		
	}


