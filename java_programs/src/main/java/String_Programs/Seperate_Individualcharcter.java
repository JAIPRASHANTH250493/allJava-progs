package String_Programs;

public class Seperate_Individualcharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="a jj a jnfo d  jqno  r jjwnfo e";
		String[] sh=given.split(" ");
		for (String string : sh) {
			if(string.length()==1) {
				System.out.println("single charc is"+"  "+string);
			}
		}
		
	}

}
