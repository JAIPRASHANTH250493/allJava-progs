package w3resouse_string;

import java.util.ArrayList;

public class s79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="zzg....kitandkatc....zjg....aket...zbg..oket";

		ArrayList<Character> ar=new ArrayList<Character>();


		char[] c=s.toCharArray();
		for (int i = 1; i < c.length; i++) {

			if(!(c[i-1]=='z'&&c[i+1]=='g')) {
				ar.add(c[i]);
			}

		}System.out.println(ar);
	}

}
