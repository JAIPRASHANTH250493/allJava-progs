package w3resoursesString_prgs;

public class s56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="food";
		String s1="door";
	
		
		if(s.charAt(s.length()-1)==s1.charAt(0)) {
			String news=s.replace("d"," ");
			news.concat(s1);
			System.out.println(news.concat(s1));
		}
	}

}
