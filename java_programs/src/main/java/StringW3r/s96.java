package StringW3r;

public class s96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="zzzzlllzzzllllzlllllzzllzlzz";
		System.out.println(s);

		char[] c=s.toCharArray();
		for (int i = 0; i<=s.lastIndexOf('z'); i++) {

			if(!(i>0 && i<s.length()-1&&c[i]=='z')) {

				System.out.print(c[i]);
			}
		}
	}
}


