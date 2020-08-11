package W3resources_ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class Sort_numberic_array {


	@Test
	public void numberarray() {

		int a[]= {5,8,1,23,55,7,0,1};

		Arrays.sort(a);
		System.out.println(a.toString());
		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("...................................");
		int b[]= {5,841,23,55,7,50,123,2};
		for (int i : b) {
			System.out.println(i);
		}
		System.out.println(".................");
		int temp=0;

		ArrayList<Integer> in=new ArrayList<Integer>();
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {


				if(b[i]>b[j]) {

					temp=b[i];
					b[i]=b[j];
					b[j]=temp;

				}}
			System.out.println(b[i]);

		}
		System.out.println(b.toString());

	}
	
	@Test
	public void SortingString() {
		
		
	String a[]= {"java","abc","jaga","yah","harmone"};
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
