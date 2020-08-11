package w3resoursesString_prgs;

public class s86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="welcommme";
		char c[]=s.toCharArray();
		for (int i = 1; i < c.length-1; i++) {
			
			if(c[i-1]==c[i]) {
				if(c[i]==c[i+1]) {
					System.out.println("trple is"+c[i]);
				}
			}
		}
	}

}
