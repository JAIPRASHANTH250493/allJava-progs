package w3resoursesString_prgs;

public class s90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="thisisthethisisthe";
		int the=0;
		int is=0;
		for (int i = 0; i < s.length(); i++) {
			
			
			if(s.substring(i,i+3).equals("the")&&i<s.length()) {
				
				the++;
			}
			if(s.substring(i, i+2).equals("is")&&i<s.length()-3) {
				is++;
			}
		}
		System.out.println(the);
		
		System.out.println(is);
	}

}
