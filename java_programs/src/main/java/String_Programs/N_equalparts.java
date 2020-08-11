package String_Programs;

public class N_equalparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="jaiprashanth";
		int len=given.length();
		int div=3;

		int limit=len/div;
		String s="";
		char ch[]=given.toCharArray();
		for(int i=0;i<div;i++) {
			s="";
			for(int j=i*limit;j<(i+1)*limit;j++) {

				s=s+ch[j];
			}
			System.out.println(s);
		}
	}

}
