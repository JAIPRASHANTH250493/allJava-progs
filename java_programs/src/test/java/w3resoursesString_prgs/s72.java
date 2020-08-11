package w3resoursesString_prgs;

public class s72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kjpypkpop";
		char c[]=s.toCharArray();
		int coun=0;
		for (int i = 0; i < c.length-2; i++) {



			if(s.substring(i, i+3).equals("pop")) {
				System.out.println("is present");
				coun++;
			}}
		for (int i = 1; i < c.length; i++) {

			if(c[i-1]=='p'&&c[i+1]=='p') {
				System.out.println("pop apperas");
				coun++;
			}
		}
		System.out.println(coun);
	}
}
