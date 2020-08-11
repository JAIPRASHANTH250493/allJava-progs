package W3resoursesArrays;

import java.util.Arrays;

public class copy_arra_inti_another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,6,3,65};
		int[] b=new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
