package W3resoursesArrays;

import java.util.Arrays;

public class sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,6,7,9,23,3};
		String b[]= {"jai","java","prashanth","common","taz"};
		
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
				
	}

}
