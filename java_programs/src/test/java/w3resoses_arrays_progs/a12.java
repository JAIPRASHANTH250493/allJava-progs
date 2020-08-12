package w3resoses_arrays_progs;

import java.util.HashSet;
import java.util.Set;

public class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,4,2,4,2,6,6,4,3};
		
		Set<Integer> s=new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			
			if(s.add(a[i])==false) {
				System.out.println("dplicateis  "+a[i]);
			}
		}
	}

}
