package w3resoursesString_prgs;

public class s54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome 			 to		 wersource";
		String f="tower";

		char c[]=s.toCharArray();
		String dd=s.replaceAll("\\s", "");
		System.out.println(dd);
		
		if(dd.contains("tower")) {
			System.out.println("tre");
		}
	}

}
