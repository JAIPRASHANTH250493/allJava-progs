package String_Programs;

public class Total_Vowels_Consonants {

	public static void main(String[] args) {

		String given="aeiou prshnth a vopppeqai";
		char[]ch=given.toCharArray();
		int vowel=0;
		int consonanat =0;

		for (char c : ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println("vowel"+" "+c);
				vowel++;
			}
			else {
				System.out.println("consonant"+" "+c);
				consonanat++;
			}
		}
		System.out.println( "tottalvowels  ="+""+vowel);
		System.out.println("totlaconsonant =="+" "+consonanat);


	}

}
