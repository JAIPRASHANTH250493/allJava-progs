package StringW3r;

public class s75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="xxxabcxxxxx";

char c[]=s.toCharArray();
int len=s.length()/2;

if(s.substring(len-1, len+2).equals("abc")) {
	System.out.println("abc is in mibble");
}
else {
	System.out.println("not");
}
	}

}
