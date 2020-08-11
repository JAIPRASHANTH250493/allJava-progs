package W3resources_ARRAY;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {-2,1,0,5,-1,-4};

		int sum=2;
		Set<Integer> s=new TreeSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					
					if(a[i]+a[j]+a[k]==sum) {
						System.out.println("sum of three number equals 2 ="+"["+a[i]+" "+a[j]+a[k]+"]");
s.add(a[i]);
s.add(a[j]);
s.add(a[k]);
System.out.println(s);
					}
					s.clear();
				}
			}
		}
		
	}

}
