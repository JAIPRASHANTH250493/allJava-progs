package w3resoursesString_prgs;


public class s94 {
	public static void main(String args[]) {

	String s="rotavator";
	char c[]=s.toCharArray();
	
	String news="";
	for (int i = c.length-1; i>=0; i--) {
		
		news=news+c[i];
	}
	
	if(news.equals(s)) {
		System.out.println("it istrue");
	}

}
}