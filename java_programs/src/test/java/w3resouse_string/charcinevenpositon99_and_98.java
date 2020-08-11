package w3resouse_string;

public class charcinevenpositon99_and_98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="w3resource.com";

char c[]=s.toCharArray();
for (int i = 0; i < c.length; i++) {
	
	if(i%2==0) {
		System.out.print(c[i]);
	}
}
String f=
"fizzsezz";
char c1[]=f.toCharArray();
for (int i = 0; i < c1.length-1; i++) {
	if(c1[i]=='z'&&c1[i+1]=='z') {
		
		System.out.println(i+ " "+(i+1));
	}
}

	}

}
