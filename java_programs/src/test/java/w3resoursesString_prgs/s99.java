package w3resoursesString_prgs;

public class s99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="w3resource.com";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			
			if(i%2==0) {
				System.out.print(c[i]);
			}
		}
		
	}

}
