package W3resources_ARRAY;

import java.util.ArrayList;

public class Common_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> in=new ArrayList<String>();

		String str[]= {"java","abcd","java","hello","tom"};
		String str1[]= {"java","abcd","java","abcd","hello","jai","prashanth"};
		for (int i = 0; i < str.length; i++) {
			if(str[i]==str1[i]) {
			System.out.println("comons elements are"+" "+str[i]);
			}
			
		}



	}

}
