package w3resouse_string;

public class indexposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "The quick brown fox jumps over the lazy dog.";

        char c[]=str.toCharArray();
        for (int i = 0; i < c.length; i++) {
		System.out.println(str.indexOf(c[i], 0));
		}
	}

}
