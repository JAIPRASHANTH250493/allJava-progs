package W3resources_ARRAY;

import java.util.HashSet;
import java.util.Set;

public class Duplicat_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[]= {"java","abcd","java","hello","abcd","tom"};
		Set<String> s=new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			
			if(s.add(str[i])==false){
				System.out.println("dup is ther"+" "+str[i]);
			}
		}
		

	}

}
