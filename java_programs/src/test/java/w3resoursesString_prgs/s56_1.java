package w3resoursesString_prgs;

public class s56_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="string";
		char c[]=s.toCharArray();
		char te=' ';
		System.out.println(s.substring(s.length()-2, s.length()));
		if(s.substring(s.length()-2, s.length()).equals("ng")) {
			
			System.out.print(s.substring(0, s.length()-1));
			te=c[s.length()-1];
			c[s.length()-1]=c[s.length()-2];
			c[s.length()-2]=te;
			System.out.print(c[s.length()-2]+""+c[s.length()-1]);
			
		}
	}

}
