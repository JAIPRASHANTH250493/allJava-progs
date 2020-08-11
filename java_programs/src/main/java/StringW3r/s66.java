package StringW3r;

public class s66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="hhjjhoat";
		
			
		if(given.charAt(0)=='g'||given.charAt(1)=='h') {
			System.out.println(given);
		}else if(given.charAt(0)=='g'&&given.charAt(1)!='h') {
			System.out.println(given.charAt(0)+given.substring(2));
		}else if(given.charAt(0)!='g'&&given.charAt(1)=='h') {
			System.out.println(given.substring(3));
		}
		
		String s="edeeucated";
		if(s.substring(0, 2).equals("ed")&&s.substring(s.length()-2, s.length()).equals("ed"))
		{
			for (int i = 2; i < s.length(); i++) {
				System.out.print(s.charAt(i));
			}
		}else {
			System.out.println("notng");
		}
			
	}

}
