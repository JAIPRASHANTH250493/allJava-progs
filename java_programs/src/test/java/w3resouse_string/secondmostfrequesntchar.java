package w3resouse_string;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class secondmostfrequesntchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="succcccccceeessss";

		Map<Character,Integer> m=new TreeMap<Character,Integer>();

		char c[]=s.toCharArray();
		int num=0;
		for (int i = 0; i < c.length; i++) {

			if(m.containsKey(c[i])) {
				m.put(c[i], m.get(c[i])+1);
			}
			else {
				m.put(c[i],1);
			}

		}
		
		System.out.println(m.entrySet());
		Set<Entry<Character, Integer>> set=m.entrySet();
		int max=0;
		
		
		for (Entry<Character, Integer> entry : set) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				key1=entry.getKey();
			}
		
		
		}System.out.println(max);
	}
}
