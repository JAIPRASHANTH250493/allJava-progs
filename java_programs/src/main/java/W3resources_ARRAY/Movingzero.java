package W3resources_ARRAY;

import java.util.Arrays;

public class Movingzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,5,0,7,8,0,5,0,4,0};
		System.out.println(Arrays.toString(a));

		
		int temp=0;
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(a));
	}

}
