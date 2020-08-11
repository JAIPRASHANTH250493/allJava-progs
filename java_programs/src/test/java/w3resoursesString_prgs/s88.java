package w3resoursesString_prgs;

public class s88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="it is a string";
String c[]=s.split(" ");
String news="";
for (int i = 0; i < c.length; i++) {
	
	if(c[i].equals("is")) {
		
	news=c[i].replace("is", "is not");
	System.out.print(news+" ");
	
	}else {
		System.out.print(c[i]+" ");
	}
}

	}

}
