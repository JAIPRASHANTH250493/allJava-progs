package String_Programs;

public class Count_NumberOfLetters {

	public static void main(String[] args) {

		String given="jaiprashanthRG";
		char ch[]=given.toCharArray();
		int count=0;
		for (char c : ch) {

			System.out.print(c);
			count++;
		}
		System.out.println(count);
	}

}
