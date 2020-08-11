package W3pack2;

public class Reverse_every_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="hello jai prashanth";
		String s1=s;
		String z="";
		
		char c[]=s.toCharArray();
		for (int i = c.length-1; i>=0; i--) {
			System.out.print(c[i]+"");
		}
		
		System.out.println();
		String sp[]=s1.split(" ");
		
		for (int i =0; i<sp.length; i++) {
			z="";
			char ch[]=sp[i].toCharArray();
			for (int j = ch.length-1; j>=0; j--) {
				z=z+ch[j];
			}
			System.out.print(z+"  ");
			
		String rev=	reverse(s);
		System.out.println(rev);
		}
	}
	
	public static String reverse(String str) {
		
		if(str.length()<=1) {
			return str;
		}
		
		return reverse(str.substring(1)
				)+str.charAt(0);
	}

}
