package W3resoursesArrays;

import java.util.HashMap;

public class majrity_elemts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,5,3,5,6,3,7,9,2,3,3,3,3,2,3,3,3,3,9,4};

		int len=a.length/2;
		System.out.println(len);
		HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();

		for (int i = 0; i < a.length; i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i])+1);
			}else
			{
				m.put(a[i], 1);
			}
		}System.out.println(m.entrySet());
		
		for (int i = 0; i <m.size(); i++) {
			
				
				System.out.println(m.get(i));
			}
		
	}

}
