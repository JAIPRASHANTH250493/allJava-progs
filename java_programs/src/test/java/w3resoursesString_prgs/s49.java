package w3resoursesString_prgs;

public class s49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="godisgood";
		char c[]=s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			for (int k = i+1; k < c.length; k++) {
				if(c[i]!=c[k]) {
					System.out.println("non repeated so for is  "+c[i]);
				}else {
					break;
				}
			}
		}
	}

}
