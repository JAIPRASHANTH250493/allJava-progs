package w3resouse_string;

public class s84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome";

char c[]=s.toCharArray();
for (int i = 4; i >=0; i--) {
	
	for (int j = 0; j < i; j++) {
		
		System.out.print(c[j]);
	}
}
	}

}
