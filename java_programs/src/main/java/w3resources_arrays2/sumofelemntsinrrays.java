package w3resources_arrays2;

import java.util.Arrays;

public class sumofelemntsinrrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		
		int len=a.length;
		int total=0;
		for (int i = 0; i < a.length; i++) {
			
			total=total+a[i];
		}
		int sumavg=total/len;
		System.out.println(sumavg);
		
		
	}

}
