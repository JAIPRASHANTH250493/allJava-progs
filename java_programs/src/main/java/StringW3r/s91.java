package StringW3r;

public class s91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="mam is in the room";
String[]sr=s.split(" ");
int cp=0;
for (int i = 0; i < sr.length; i++) {
	
	char c[]=sr[i].toCharArray();
	if(c[c.length-1]=='m'||	c[c.length-1]=='n') {
		cp++;
	}
}
System.out.println(cp);

	}

}
