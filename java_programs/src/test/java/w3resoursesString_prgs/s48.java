package w3resoursesString_prgs;

public class s48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abdnfbsdacac";
		char c[]=s.toCharArray();
		String n="";
		for (int i = 0; i < c.length; i++) {


			if(!(c[i]=='b')) {
		n=n+c[i];
			}

		}
		System.out.println(n.replaceAll("ac",""));
	}

}
