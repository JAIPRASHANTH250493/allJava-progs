package w3resouse_string;

public class prb97_96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="zzlllzlzlzlzlzzzlzlzlzlzz";
		
		char c[]=s.toCharArray();
		
			System.out.println(s.substring(s.indexOf('z')+1,s.lastIndexOf('z')));
		
		for (int i = 0; i < s.lastIndexOf('z'); i++) {
			
			if(!(i>0 && i<s.length()-1&&c[i]=='z')) {
				
				System.out.print(c[i]);
			}
		}
			}

}

