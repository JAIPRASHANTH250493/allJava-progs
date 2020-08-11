package StringW3r;

public class s79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="infizjgokwn";
		char c[]=s.toCharArray();
		for (int i = 1; i < c.length; i++) {
			if(c[i-1]=='z') {
				if(c[i+1]=='g') {
					System.out.print(" ");
				}
			}else {
				System.out.print(c[i]);
			}
		}

	}

}
