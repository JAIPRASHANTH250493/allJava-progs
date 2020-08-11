package String_Programs;

public class LOWER_TO_UPPER_VICEVERSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="JAiprashantTH";
		
		char ch[]=given.toCharArray();
for (char c : ch) {
	//System.out.println(c);
	if(Character.isLowerCase(c)) {
		
		int c1=(int)c-32;
		char c2=(char)c1;
		
		System.out.print(c2);
	}else if(Character.isUpperCase(c)) {
		int c1=(int)c+32;
		char c2=(char)c1;
		System.out.print(c2);
	}
}
		
	}

}
