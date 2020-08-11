package StringW3r;

public class s94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rotavwdvator";
		
		String t="";
		String t1="";
		char c[]=s.toCharArray();
		for (int i = s.length()-1;i>0; i--) {
			t=t+c[i];
		}
		
		char ch[]=t.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(c[i]==ch[i]) {
				t1=t1+c[i];
				
			}
			else {
				System.out.println(t1);
				break;
			}
			
		}
	}

}
