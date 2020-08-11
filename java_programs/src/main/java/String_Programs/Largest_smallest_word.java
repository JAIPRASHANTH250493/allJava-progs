package String_Programs;

public class Largest_smallest_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="hello im jai prashanth a jaiprashath";
		String[] s=given.split(" ");

		String high=s[1];
		String small=s[1];

		for(int i=0;i<s.length;i++) {
			if(high.length()>s[i].length()) {
				small=s[i];
			}else if(small.length()<s[i].length()) {
				high=s[i];

			}
		}
		System.out.println(high);
		System.out.println(small);
	}

}
