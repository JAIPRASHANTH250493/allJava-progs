package w3resoursesString_prgs;

import java.util.Arrays;

public class s42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rabbit   bribe   dog";
		String[] st=s.split(" ");
		String co="bib";
		String cq="";

		char v[]=co.toCharArray();
		
		for (int i = 0; i < st.length; i++) {
			cq=cq+v[i];
		}
		String cc="";

		for (int i = 0; i < st.length; i++) {
			char  c[]=st[i].toCharArray();

			for (int k = 0; k < c.length; k++) {
				cc=cc+c[i];
			}
			if(cc.contains("bib")) {
				System.out.println(st[i]+" contins bib");
			}

		}
	}

}
