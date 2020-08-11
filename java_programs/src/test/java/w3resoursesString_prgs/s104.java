package w3resoursesString_prgs;

import java.util.Arrays;

public class s104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a[]={"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
	String temp="";
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			
			if(a[i].length()>a[j].length()) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	System.out.println(Arrays.toString(a));

	}

}
