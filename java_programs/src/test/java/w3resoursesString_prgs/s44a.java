package w3resoursesString_prgs;

public class s44a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abcdefghiklnop";
rev(s);
	}

	public static String rev(String str) {
		
			if(str.length()>1)
		System.out.print(str.charAt(str.length()-1));
		return rev(str.substring(0, str.length()-1));
		
	}}

