package w3resoursesString_prgs;

public class s74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MrsJemsmrsamMrs";
		int c=0;

		for (int i = 0; i < s.length(); i++) {
			if(s.substring(0, 3).equals("Mrs")) {
				if(s.substring(i, i+3).equals("Mrs")) {

					c++;
					System.out.println(",,");
				}
				if(c>1) {
					System.out.println("mrs appears ore than once");
					break;
				}
			}
		}

	}}
