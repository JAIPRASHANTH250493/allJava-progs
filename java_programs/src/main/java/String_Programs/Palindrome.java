package String_Programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="malahjkyalam";
		char ch[]=given.toCharArray();
		String given1="";
		
		for(int i=given.length()-1;i>=0;i--) {
			
			given1=given1+ch[i];
		}
		System.out.println(given1);
		if(given.equals(given1)) {
			System.out.println("itis palindrome");
		}else {
			System.out.println("it is not");
		}
	}

}
