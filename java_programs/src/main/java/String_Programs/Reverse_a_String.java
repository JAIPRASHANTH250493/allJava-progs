package String_Programs;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="jaiprashath";
		char[] ch=given.toCharArray();
		String s2="";

		for(int i=given.length()-1;i>=0;i--) {
			s2=s2+ch[i];
		}
		System.out.println(s2);

		System.out.println("........................case 2........revese  sentence...................");

		String given2="hello jai prashath";
		String[] st=given2.split(" ");
		String rev="";
		for(int i=st.length-1;i>=0;i--) {
			rev=rev+" "+st[i];
		}
		System.out.println(rev);
		System.out.println("..................case 3 revers eachword fot he sentence.............");
		
		
		String g="hello im am jai  prashanth rg ";
	
		String[] s=g.split(" ");
		char[] ar;
		String finals="";
		for (String string : s) {
			finals="";
			
			ar=string.toCharArray();
			for(int i=ar.length-1;i>=0;i--) {
				finals=finals+ar[i];
			}
			System.out.print(finals+"  ");
		}
		
		
		
		

	}

}
