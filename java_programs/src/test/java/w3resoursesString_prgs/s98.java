package w3resoursesString_prgs;

public class s98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Fizzez";
char c[]=s.toCharArray();

for (int i = 0; i <=c.length; i++) {
	if(c[i]==c[i+1]) {
		System.out.println(c[i]);
		System.out.println("appears");
	}
}
	}

}
