package w3resouse_string;

public class Nequalparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="jellojaiprashanth";
		int numofparts=5;
		int slength=s.length();
		int li=slength/numofparts;
		
		int j=0;
		int i=0;
		String c1="";
		
				char[] c=s.toCharArray();
		
				
			for (i = 0; i < 5; i++) {
				c1="";
				for ( j = i*li; j <(i+1)*li ; j++) {
					c1=c1+c[j];
				}
				System.out.println(c1);
			}	
	}

}
