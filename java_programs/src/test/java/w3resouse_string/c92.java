package w3resouse_string;

public class c92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="string st ring rint sssstt";

		String st[]=s.split(" ");
		for (int i = 0; i < st.length; i++) {

			if(st[i].contains("st")) {
				String news=	st[i].replace("st","");
				System.out.print(news+" ");
			}else {
				System.out.print(st[i]+" ");
			}
		}
	}

}
