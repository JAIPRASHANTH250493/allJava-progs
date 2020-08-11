package W3resoursesArrays;

import java.util.Arrays;

public class moving0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,5,0,0,5,3,0,5,03,5,33,0,5,3,0};
		int temp=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
			
			if(a[i]==0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}}
		
		System.out.println(Arrays.toString(a));
	}

}
