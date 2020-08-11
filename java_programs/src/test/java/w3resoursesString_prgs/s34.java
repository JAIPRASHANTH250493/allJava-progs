package w3resoursesString_prgs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class s34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="sccesss";

char c[]=s.toCharArray();

HashMap<Character,Integer> h=new HashMap<Character,Integer>();
for (char d : c) {
	if(h.containsKey(d)) {
		h.put(d, h.get(d)+1);

	}else
	{
		h.put(d, 1);
	}
}

System.out.println(h.entrySet());

Set<Entry<Character, Integer>> set=h.entrySet();

int cont=Integer.MIN_VALUE;
int second=0;
for (Entry<Character, Integer> entry : set) {
	if(entry.getValue()>cont) {
		cont=entry.getValue();
	}
	if(second<cont) {
		second=cont;
		
	}
}



	}

}
