package W3pack2;

public class recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="the quick brown fox jumps";

String rev=reverse(s);
System.out.println(rev);

	}
	
	public static String reverse(String s) {
		
		if(s.length()==0) {
			return s;
			
		}
		
		return reverse(s.substring(1))+s.charAt(0);
	}

}
