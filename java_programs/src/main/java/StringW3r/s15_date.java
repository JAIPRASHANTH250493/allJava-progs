package StringW3r;

import java.util.Calendar;

public class s15_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Jai yoy ARE using StingG";
		
		char c[]=s.toCharArray();
		for (char d : c) {

			if(Character.isLowerCase(d)==true) {
				int c1=d-32;
				char c2=(char)c1;
				System.out.print(c2);
			}

			else if(Character.isUpperCase(d)==true) {
				int c1=d+32;
				char c2=(char)c1;
				
			System.out.print(c2);
			}
		}



	}

}
