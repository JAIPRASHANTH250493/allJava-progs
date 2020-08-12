package w3resoses_arrays_progs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class a38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1, 4, 4, 4, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2,4,4,4,4,4,4,4,4};
		
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) {
			if(h.containsKey(a[i])) {
				h.put(a[i], h.get(a[i])+1);
			}else {
				h.put(a[i], 1);
			}
		}
		int s=a.length/2;
		System.out.println("sizeof  array  "+a.length);
		
		Set<Entry<Integer, Integer>> st=	h.entrySet();
		
		for (Entry<Integer, Integer> entry : st) {
			
			if(entry.getValue()>s) {
				System.out.println(entry.getKey()+"  is gretaer array size");
			}
		}
		
	}

}
