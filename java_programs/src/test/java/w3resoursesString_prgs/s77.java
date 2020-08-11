package w3resoursesString_prgs;

public class s77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="try and best";
		String st[]=s.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			
			System.out.print(st[0]+st[st.length-1]);
		}
	}

}
