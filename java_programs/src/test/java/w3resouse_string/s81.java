package w3resouse_string;

public class s81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="redcapmanwithbluecar";
		int c=0;
		int c1=0;
		
		
		char ch[]=s.toCharArray();
		for (int i = 0; i < s.length()-2; i++) {
			
			if(s.substring(i, i+3)=="red")
{
	c++;
}	
		}
		System.out.println(c);
		System.out.println(c1);
	}

}
