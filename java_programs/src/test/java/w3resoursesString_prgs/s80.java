package w3resoursesString_prgs;

public class s80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="moonm#night";
char c[]=s.toCharArray();

for (int i = 1; i < c.length; i++) {
	if(c[i]=='#') {
	if(c[i-1]==c[i+1]) {
		System.out.println("same"+c[i-1]);
	}
	else {
		System.out.println("nothng");
	}
}}
	}

}
