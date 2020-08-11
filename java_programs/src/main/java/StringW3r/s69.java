package StringW3r;

public class s69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="sntoastbuttertoast";
		
		
		int begin=given.indexOf("butter");
		System.out.println(begin);
		if(given.substring(begin-5, begin).equals("toast")&&
				given.substring(begin+6, begin+11).equals("toast")){
			System.out.println("butter conatiins toast both side");
			
		}else
		{
			System.out.println("itdoes not conatin");
		}
	}

}
