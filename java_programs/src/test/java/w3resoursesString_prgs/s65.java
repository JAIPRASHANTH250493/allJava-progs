package w3resoursesString_prgs;

public class s65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testcricke";
		char c[]=s.toCharArray();
		for (int i =1 ; i < c.length-1; i++) {
			if(c[0]=='t'&&c[s.length()-1]=='t') {
				System.out.print(c[i]);
			}else {
				System.out.println(s);
				break;
			}
			
		}
	}

}
