package w3resoursesString_prgs;

public class s103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdefabcdeabcdaaa";
		char r='a';
		char c[]=s.toCharArray();
		for (char d : c) {
			
			if(d!=r) {
				System.out.print(d);
			}
		}
	}

}
