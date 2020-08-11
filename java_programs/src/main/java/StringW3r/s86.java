package StringW3r;

public class s86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welllcommmmeee";
		
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if((c[i]==c[i+1])) {
				if(c[i+1]==c[i+2])
				System.out.println("triple is   "+c[i]);
			}
			
		}
	}

}
