package StringW3r;

public class s98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="fizdzez";

char[] c=s.toCharArray();

for (int i = 0; i < c.length; i++) {
	
	if(c[i]==c[i+1]) {
		System.out.println("yes zz is "+" "+c[i]+c[i+1]);
	}else {
		System.out.println("no");
	}
}

	}

}
