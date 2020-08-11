package W3resources_ARRAY;

public class Sum_equals_to_givenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,5,7,5,6,7,9,2,3,4};
		
		int sum=9;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]+a[j]==sum) {
					System.out.println("sum of two number equals 9 ="+a[i]+" "+a[j]);
				}
			}
		}

	}

}
