package String_Programs;

public class Count_Total_Punctuation {

	public static void main(String[] args) {

		String given="jaiprashanthRG./@)*^%*";
		String replaced=	given.replaceAll("[^a-zA-Z0-9]", "");
		int total=given.length()-replaced.length();
		System.out.println(total);
	}

}
