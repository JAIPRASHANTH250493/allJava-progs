package W3resources_ARRAY;

import java.util.HashMap;
import java.util.Map;

public class Number_of_dup_element_appears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,5,7,5,7,5,5,7,5,7,7,7,5,5,5,7,7,7,7};
		int size=a.length;
		
		System.out.println(size);
		
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		
		for (int i : a) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			else {
				m.put(i, 1);
			}
			
			if(m.get(i)>=size/2) {
				System.out.println("major number is"+ i);
				
			}
		}
		
		
		System.out.println(m);

	}

}
