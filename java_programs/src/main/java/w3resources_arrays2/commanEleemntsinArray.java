package w3resources_arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class commanEleemntsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"java","abcd","java","hello","abcd","knd"};
		String str1[]= {"java","abcd","java","knd","abcd","tom"};
		
		//String str2[]= {"java","knd","java","hello","abcd","tom"};
		
		Arrays.sort(str);
		Arrays.sort(str1);

		//Arrays.sort(str2);
		
		ArrayList<String> in=new ArrayList<String>();

		
		int x=0;
		int y=0;
		
		while(x<str.length&&y<str1.length) {
			
			if(str[x]==str1[y]){
				in.add(str[x]);
				
			}
			
			else if(str[x]<str1[y]) {
				
			}
			
		}
}
}