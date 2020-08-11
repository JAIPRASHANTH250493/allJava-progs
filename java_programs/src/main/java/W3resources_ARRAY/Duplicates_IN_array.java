package W3resources_ARRAY;

import java.util.HashSet;
import java.util.Set;

public class Duplicates_IN_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {3,5,8,3,7,100,55,23,55,4};

		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate is present......");
				}
			}
		}

		int b[]= {3,5,8,3,7,100,55,23,55,4};

		Set<Integer> s=new HashSet<Integer>();
		for (Integer integer : b) {
			if(s.add(integer)==false) {
				System.out.println("dupis thre"+ integer);
			}
		}


	}

}
