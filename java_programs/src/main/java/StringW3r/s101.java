package StringW3r;

public class s101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="1228845yy398477599494";
for (int i = 0; i < s.length(); i++) {
	
	if(!Character.isDigit(s.charAt(i))) {
		System.out.println("yes it is number string"+s.charAt(i));
		break;
	}
}

	}

}
