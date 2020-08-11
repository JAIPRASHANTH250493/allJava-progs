package StringW3r;

public class s68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome";
char c[]=s.toCharArray();
char temp;

for (int i = 0; i < s.length()-1; i+=2) {
	
	temp=c[i];
	c[i]=c[i+1];
	c[i+1]=temp;
	System.out.print(c[i]+""+c[i+1]);
	
	
}
	}

}
