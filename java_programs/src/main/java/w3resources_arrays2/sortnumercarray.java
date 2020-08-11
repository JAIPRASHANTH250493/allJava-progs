package w3resources_arrays2;

import java.util.Arrays;

public class sortnumercarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,71,4,6};
	
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
		
				if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

}
