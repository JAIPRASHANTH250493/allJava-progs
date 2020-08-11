package w3resoursesString_prgs;

public class s85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="weablcoabmeab";
		
		char c[]=s.toCharArray();
		
		
		for (int i = 1; i < s.length()-2; i++) {
			
			if(s.substring(i, i+2).equals("ab")) {
				
				System.out.print(c[i-1]+""+c[i+2]);
			}
		}
	}

}
