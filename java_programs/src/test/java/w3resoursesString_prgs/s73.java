package w3resoursesString_prgs;

public class s73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="test.abctest";

		

			if(s.substring(0, s.indexOf('.')).contains("abc")) {
				System.out.println("abc appears before period");
			}else {
				System.out.println("abc appears after period");
			}

		}
	}


