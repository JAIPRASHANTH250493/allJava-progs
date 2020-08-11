package w3resoursesString_prgs;

public class s92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="thisis the test string";

String ar[]=s.split(" ");

for (String string : ar) {
	
if(string.contains("st")) {
	String n=string.replace("st", "");
	
	System.out.println(n);
}
else {
	System.out.println(string);
}
}
	}

}
