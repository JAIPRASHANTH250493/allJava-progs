package W3resources_ARRAY;

import java.util.Arrays;

public class clockwiseRotattion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,6,8,10};
		int b=a[a.length-1];
		System.out.println(Arrays.toString(a));;
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
			a[0]=b;
			
		}
		System.out.println(Arrays.toString(a));
		
	}

}
