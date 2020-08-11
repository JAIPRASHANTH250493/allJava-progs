package StringW3r;

public class Compare_two_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="example java";
		String s1="Example java";
	char c[]=s.toCharArray();
	char c1[]=s1.toCharArray();
	
			
	System.out.println(s.codePointAt(3));
	System.out.println(s.compareTo(s1));
	System.out.println(s.codePointBefore(2));
	System.out.println(s.compareToIgnoreCase(s1));
	System.out.println(s.concat(s1));
	System.out.println(s.contains("ava"));
	
	StringBuffer b=new StringBuffer();
	
	b.append(s);
	System.out.println(b);
	
	}

}
