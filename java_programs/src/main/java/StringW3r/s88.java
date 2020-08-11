package StringW3r;

public class s88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="jjnf is jnf is jne";
		String s1="";
		String s2="";
		
		String[] a=s.split(" ");
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i].equals("is")){
					
			
			s2=a[i].replace("is", "is not");
			System.out.println(s2);
		}else {
			System.out.println(a[i]);
		}}		
	}}


