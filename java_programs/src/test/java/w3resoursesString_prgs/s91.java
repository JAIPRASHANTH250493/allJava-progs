package w3resoursesString_prgs;

public class s91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="mam is inm the room";
String ar[]=s.split(" ");

int count=0;
for (int i = 0; i < ar.length; i++) {
	
char c[]=ar[i].toCharArray();
if(c[c.length-1]=='m') {
	System.out.println(ar[i]);
	count++;
}
}
System.out.println(count);
	}

}
