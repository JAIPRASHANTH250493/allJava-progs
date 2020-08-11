package ARRAYS;

import java.util.Arrays;

public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,3,7,9,1,0,8,11,-7};

		int low=a[1];

		for(int i=0;i<a.length;i++) {
			if(a[i]<low) {
				low=a[i];
			}
		}
		System.out.println(low);

		System.out.println(".....................case2.......largest");

		int ab[]= {4,6,3,7,9,1,0,8,11,-7};
		int high=a[1];
		for(int i=0;i<ab.length;i++) {
			if(a[i]>high) {
				high=a[i];
			}
		}
		System.out.println(high);
		System.out.println(".........case3 with strings............");
		
		String s[]= {"jai","hello","world","computer","prashanth"};
		Arrays.sort(s);
		System.out.println(s);
		
		String h=s[1];
		
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>h.length()) {
				h=s[i];
			}
		}
		System.out.println(h);
	}


}
