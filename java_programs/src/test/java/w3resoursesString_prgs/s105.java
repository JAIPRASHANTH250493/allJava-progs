package w3resoursesString_prgs;

public class s105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="abcd abc aabc baa abcaa";
		String[] s=a.split(" ");
		int count=0;
		for (int i = 0; i < s.length; i++) {
			
			if(s[i].contains("aa")) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
