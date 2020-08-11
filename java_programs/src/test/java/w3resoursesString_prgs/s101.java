package w3resoursesString_prgs;

public class s101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="123c4567";
		char c[]=s.toCharArray();
		for (char d : c) {
			
			if(Character.isDigit(d)==false) {
				System.out.println("it is a char  "+d);
				break;
			}else {
				System.out.println("..");
			}
		}
	}

}
