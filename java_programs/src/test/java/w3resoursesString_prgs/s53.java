package w3resoursesString_prgs;

public class s53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abcded";
String s1="adbc*d)^";

String n=s1.replaceAll("[^a-z]", "");
System.out.println(n);

if(s.contains(n)) {
	System.out.println("contains");
}else {
	System.out.println("notconatins");
}

	}

}
