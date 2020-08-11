package w3resouse_string;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class firstnonrepatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="llojaijaijaeid";
		
		Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();

		char c[]=s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {

			if(m.containsKey(c[i])) {
				m.put(c[i], m.get(c[i])+1);
			}
			else {
				m.put(c[i],1);
			}

		}
		
		System.out.println(m.entrySet());
		Set<Entry<Character, Integer>> e=	m.entrySet();
for (Entry<Character, Integer> entry : e) {
	if(entry.getValue()==1) {
		System.out.println("first non repating charcis"+ entry.getKey());
		break;
	}
}
	}

}
