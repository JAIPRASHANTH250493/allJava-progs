package w3resoursesString_prgs;

public class s45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is a new string";
		String st[]=s.split(" ");
		for (int i = st.length-1; i>=0; i--) {
			System.out.println(st[i]);
		}
	}

}
