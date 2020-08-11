package w3resoursesString_prgs;

public class s66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="photo";
		
		char c[]=s.toCharArray();
		
		if(c[0]=='g') {
			System.out.print(c[0]);
			
		}
		if(c[1]=='h') {
			System.out.print(c[1]);
		}
		
		for (int i =2; i < c.length; i++) {
			
			System.out.print(c[i]);
			
		}
	}

}
