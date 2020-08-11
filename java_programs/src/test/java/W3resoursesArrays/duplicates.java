package W3resoursesArrays;

import java.util.HashSet;
import java.util.Set;

public class duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,86,6,6,7,9,10,11,7,13,14,14};

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println("duplicate is   "+a[i]);
				}
			}
		}
		
		Set<Integer> s=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(s.add(a[i])==false) {
				System.out.println("dupis ="+a[i]);
			}
		}
	}

}
