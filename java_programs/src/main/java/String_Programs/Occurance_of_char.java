package String_Programs;

import java.util.HashMap;

public class Occurance_of_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="jaiprashanthrrRG";

		char[] ch=given.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();

		for (char c : ch) {
			if(h.containsKey(c)) {
				h.put(c, h.get(c)+1);
			}else {
				h.put(c, 1);
			}
		}
		System.out.println(h.entrySet());
	}

}
