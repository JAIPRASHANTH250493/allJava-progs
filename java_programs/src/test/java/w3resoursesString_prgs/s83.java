package w3resoursesString_prgs;

public class s83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome";
		String s1="w3resource";
		
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		
		for (int i = 0; i < Math.max(s.length(), s1.length()); i++) {
			
			if(i<s.length()) {
				System.out.print(c[i]);
			}
			if(i<s1.length()) {
				System.out.print(c1[i]);
			}
			
		}
	}

}
