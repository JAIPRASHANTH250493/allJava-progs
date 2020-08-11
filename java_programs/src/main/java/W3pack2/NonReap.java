package W3pack2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class NonReap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="test stringzoxa";
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
		Set<Entry<Character,Integer>> hash=h.entrySet();
		Set<Character> hash1=new HashSet<Character>();
		
		for (Entry<Character, Integer> entry : hash) {
			
			if(entry.getValue()==1) {
				hash1.add(entry.getKey());
			}
		}
		
		System.out.println(hash1);
		
		
}}
