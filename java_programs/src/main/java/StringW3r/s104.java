package StringW3r;

import java.util.ArrayList;
import java.util.Arrays;

public class s104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
		ArrayList<String> ar=new ArrayList<String>();
		
		
		String as="";
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i].length()>s[j].length()) {
					
					as=s[i];
					s[i]=s[j];
					s[j]=as;
					
					
					
				}
			}
			
		}
				System.out.println(Arrays.toString(s));
				System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
				String s1[]= {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
				String as1="";
			
				
				
				
				
				for (int i = 0; i < s1.length; i++) {
					for (int j = i+1; j < s.length; j++) {
						if(s1[i].length()<s1[j].length()) {
							
							as1=s1[i];
							s1[i]=s1[j];
							s1[j]=as1;
							
							
							
						}
					}
					
				}
				System.out.println(Arrays.toString(s1));

				System.out.println(s1);
	}

}
