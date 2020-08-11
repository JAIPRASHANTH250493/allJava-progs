package W3pack2;

public class EqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="jaiprashanth";
		
		int div=4;
		int length=given.length()/4;
		String s="";
		
		for (int i = 0; i <div; i++) {
			s="";
			for (int j =i*length ; j < (i+1)*length; j++) {
				
				s=s+given.charAt(j);
			}
			System.out.println(s);
			
		}
	}

}
