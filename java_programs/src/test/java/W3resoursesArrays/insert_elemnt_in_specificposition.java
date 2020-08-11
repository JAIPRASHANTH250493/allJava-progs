package W3resoursesArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class insert_elemnt_in_specificposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {0,1,2,3,4,5,6,8};
int index=4;
		
		int value=7;
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for (int i = a.length-1; i>4; i--) {
			a[i]=a[i-1];
		}
		a[index]=value;
		
		
	
		
		System.out.println(Arrays.toString(a));
	}

}
