package W3resoursesArrays;

public class sum_of_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {-2,1,0,5,-1,-4};

		int sum=2;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k< a.length; k++) {
					
					if(a[i]+a[j]+a[k]==sum) {
						System.out.println(a[i]+" "+a[j]+"  "+a[k]+"="+sum);
					}
				}
			}
			
		}
	}

}
