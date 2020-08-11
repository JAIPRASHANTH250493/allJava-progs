package String_Programs;

import java.util.Arrays;

public class Anagram_strings {

	public static void main(String[] args) {

		String given="listen";
		String silent="silent";

		char[] g=given.toCharArray();

		Arrays.sort(g);
		char s[]=silent.toCharArray();
		Arrays.sort(s);
		boolean b=	Arrays.equals(g, s);

		if(b==true) {
			System.out.println("it is an anagram");
		}else {
			System.out.println("not ananagram");
		}


		System.out.println("............................CASE 2.............................");

		String given2="hELLO jAIpra   shaNTH  ";
		String given3="lloHE  JaiPrashanTh	";
		
		 given2=given2.replaceAll("\\s","");
		 given3= given3.replaceAll("\\s","");
		 System.out.println(given2);
		given2= given2.toLowerCase();
		 given3=given3.toLowerCase();
		 
		 System.out.println(given2);
		 System.out.println(given3);
		 char g1[]=given2.toCharArray();
	  	 char g2[]=given3.toCharArray();
	  	 System.out.println(g1);
	  	 System.out.println(g2);
	
		Arrays.sort(g1);
		Arrays.sort(g2);
		
		boolean b1=	Arrays.equals(g1, g2);
		

		if(b1==true) {
			System.out.println("it is an anagram");
		}else {
			System.out.println("not ananagram");
		}
		
		
	
	}
	
	
	
	
	
	
	
	
	

}
