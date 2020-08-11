package w3resouse_string;

import java.util.ArrayList;

public class s68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="test#the#string";
char[]c=s.toCharArray();

ArrayList<Character> ar=new ArrayList<Character>();

for (int i = 1; i < c.length; i+=3) {
	if(!(c[i]=='#')) {
		ar.add(c[i-1]);
		ar.add(c[i]);
		ar.add(c[i+1]);
	}
}System.out.println(ar);
	}

}
