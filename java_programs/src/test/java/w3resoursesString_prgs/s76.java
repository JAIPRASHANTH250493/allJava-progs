package w3resoursesString_prgs;

public class s76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="liveonwildlife";
for (int i = 0; i <s.length()-4; i++) {
	
	if(s.substring(i, i+4).equals("life")) {
		System.out.println(s.substring(i, i+4));
	}
	else if(s.substring(i, i+5).contains("li")&&s.substring(i, i+5).contains("e")) {
		
		System.out.println(s.substring(i, i+4));
	}
	
}
	}

}
