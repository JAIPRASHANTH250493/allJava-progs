package w3resoursesString_prgs;

import java.util.HashMap;

public class s39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gibblegabbler";
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
		
		
		for (int i = 0; i < c.length; i++) {
			for (int k =i+1; k < c.length; k++) {
				if((c[i]==c[k])) {
					break;
				}else {
					System.out.println(" first non rpeated is "+c[i]);
				}
				
			}
			
		}

	}

}
