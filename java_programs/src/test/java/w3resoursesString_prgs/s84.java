package w3resoursesString_prgs;

public class s84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome";
		char c[]=s.toCharArray();
		int co=4;
		for (int i = 0; i<4; i++) {
			
			System.out.print(s.substring(0, co));
			co--;
		}
		
	}

}
