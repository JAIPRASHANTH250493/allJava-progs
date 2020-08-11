package StringW3r;

public class s99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="jello jai jai jai";
		String n="";
		
		for (int i = 0; i <s.length(); i++) {
			
			if(i%2!=0) {
				
				n=n+s.charAt(i);
				System.out.println(i);
			}
		}
		System.out.println(n);
	}

}
