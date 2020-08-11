package w3resoursesString_prgs;

public class s70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="gfpmpnpqab";
		if(s.substring(0, s.indexOf('q')).contains("p")&&!(s.substring(s.indexOf('q'),s.length()).contains("p"))) {
			System.out.println("pqbalanced");
		}
		else {
			System.out.println("not balanced");
		}
	}

}
