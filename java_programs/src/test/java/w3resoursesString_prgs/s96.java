package w3resoursesString_prgs;

public class s96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="zzndnzindinzindinzz";
		
		char c[]=s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			
			if(!(i>0&&i<s.length()-1 &&c[i]=='z')) {
				System.out.print(c[i]);
			}
		}
	}

}
