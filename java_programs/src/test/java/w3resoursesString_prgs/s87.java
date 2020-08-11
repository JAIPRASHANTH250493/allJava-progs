package w3resoursesString_prgs;

public class s87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="azzlea";
		char c[]=s.toCharArray();
		for (int i = 1; i < c.length; i++) {
			
			if(c[i-1]=='z'&&c[i]=='z') {
				System.out.println("z is happy at  "+c[i] );
			}else if(c[i]=='z'&&c[i+1]=='z'){
				System.out.println("zis hapy "+c[i]);
			}
			
		}
				
	}

}
