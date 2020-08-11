package StringW3r;

public class s100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Java "
				+ "is the foundation for virtually every "
				+ "type of networked application and is "
				+ "the global standard for developing and  "
				+ "delivering embedded and mobile applications, "
				+ "games, Web-based content,"
				+ "  and enterprise"
				+ " software. With more than 9 million developers worldwide, "
				+ "Java enables you to efficiently develop, deploy and use"
				+ " exciting "
				+ "applications and services.";
	String s1[]=	s.split(" ");
	
	for (String string : s1) {
		
		if(string=="applications,") {
			System.out.println("true");
			break;
		}
		
	}
	
	}}
