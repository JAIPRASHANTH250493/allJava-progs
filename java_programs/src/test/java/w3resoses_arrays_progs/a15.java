package w3resoses_arrays_progs;

public class a15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"ava","hello","how","are","yo"};
		String s1[]= {"hello","how","yo","find"};
		
		for (int i = 0; i < s.length; i++) {
			
			for (int k = 0; k < s1.length; k++) {
				
				if(s[i]==s1[k]) {
					System.out.println("coonis  "+s[i]);
				}
			}
		}
	}

}
