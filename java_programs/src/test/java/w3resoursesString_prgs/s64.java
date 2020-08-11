package w3resoursesString_prgs;

public class s64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="3edcated";
		if(s.substring(0, 2).equals(s.substring(s.length()-2, s.length()))) {
			System.out.println(s.substring(2, s.length()));
		}
		else {
			System.out.println(s);
		}
	}

}
