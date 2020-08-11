package W3resources_ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_Avg_of_emelemnts_except_small_big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,8,100,50,40,25};

		int small=Integer.MAX_VALUE;
		int big=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<small) {
				small=a[i];
			}
			if(a[i]>big) {
				big=a[i];
			}
			
		}
		System.out.println(small);
		System.out.println(big);
		System.out.println(big-small);
		
		int b[]=new int[a.length];
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		for (int i : a) {
			if(i==small||i==big) {
				System.out.println("not added");
			}
			else {
				l.add(i);
				
			}System.out.println(l);
		}
	}

}
