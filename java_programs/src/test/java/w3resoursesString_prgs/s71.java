package w3resoursesString_prgs;

public class s71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="xyzjbjd    jbdxyz";
		System.out.println(s.substring(s.length()-2, s.length()));
		
		if((s.substring(0, 3).equals(s.substring(s.length()-3, s.length())))){
			System.out.println("appears");
		}
	}

}
