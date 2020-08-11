package StringW3r;

public class s92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is the test string";
		String c[]=s.split(" ");
		System.out.println(c[3].contains("st"));

		for (int i=0;i<c.length;i++) {

			if((c[i].contains("st"))){
				
				
				System.out.println(c[i].replace("st", ""));
			}else {
				System.out.println(c[i]);
			}
			}
			
		}


	}





