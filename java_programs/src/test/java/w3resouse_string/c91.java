package w3resouse_string;

public class c91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mam ism in the room";
		String sp[]=s.split(" ");
		
int cou=0;
		
		for (int i = 0; i < sp.length; i++) {
			
			char c[]=sp[i].toCharArray();
			
			if(c[c.length-1]=='m') {
				cou++;
			}
			
		}
System.out.println(cou);
	}

}
