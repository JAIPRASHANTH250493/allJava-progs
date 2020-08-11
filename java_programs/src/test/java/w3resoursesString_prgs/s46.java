package w3resoursesString_prgs;

public class s46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is a new string";
		String st[]=s.split(" ");
		String n="";
		for (int i = 0; i < st.length; i++) {
			 n="";
		char c[]=	st[i].toCharArray();
			for (int k = st[i].length()-1; k>=0; k--) {
				n=n+c[k];
			}
			System.out.print(n+" ");
		}
	}

}
