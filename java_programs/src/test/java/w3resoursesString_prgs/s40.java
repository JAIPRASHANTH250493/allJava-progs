package w3resoursesString_prgs;

public class s40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghijklmnopqrstuvwxy";
		int div=5;
		int l=s.length()/div;
		String n="";
		char c[]=s.toCharArray();


		for (int i = 0; i < div; i++) {
			n="";
			for (int k = (i*l); k <(i+1)*l; k++) {
				n=n+c[k];
			}
			System.out.println(n);

		}
	}

}
