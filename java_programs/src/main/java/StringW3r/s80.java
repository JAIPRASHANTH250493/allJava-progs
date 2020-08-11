package StringW3r;

public class s80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="nfnm#mndd";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='#') {
				if(c[i-1]==c[i+1]) {
					System.out.println("true "+c[i+1]);
				}
			}
			
		}
	}

}
