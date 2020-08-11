package w3resouse_string;

public class Uppertolower_lower_to_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g=" hello  JAIPRASHANTH how ARE yoU";
		char[] c=g.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if((Character.isLowerCase(c[i]))==true) {
			System.out.print(Character.toUpperCase(c[i]));
			}else {
				System.out.print(Character.toLowerCase(c[i]));
			}
		}
	}

}
