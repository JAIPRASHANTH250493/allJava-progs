package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class frfequency_of_element {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,4,6,3,7,9,9,3,0,1};
		Map<Integer,Integer>h=new HashMap<Integer,Integer>();
for(int i=0;i<a.length;i++) {
	if(h.containsKey(a[i])) {
		h.put(a[i], h.get(a[i])+1);
	}else {
		h.put(a[i], 1);
	}
}
System.out.println(h.entrySet());
		
		
	}

}
