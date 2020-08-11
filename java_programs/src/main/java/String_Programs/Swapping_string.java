package String_Programs;

public class Swapping_string {

	public static void main(String[] args) {
	
		String given1="jaiprashath";
		String given2="RG";
		System.out.println(given1);
		System.out.println(given2);
		
		int g1=given1.length();
		int g2=given2.length();
		
		given1=given1+given2;
		 given2=given1.substring(0, g1);
		
	 given1=given1.substring(g1);
	
		System.out.println(given1);
		System.out.println(given2);
	}

}
