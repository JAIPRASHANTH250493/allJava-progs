package W3resources_ARRAY;

public class All_combnations_equals_gievn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,1,2};

		int given=53;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					for (int k2 = k+1; k2 < a.length; k2++) {

						if(Math.abs(a[i]+a[j]+a[k]+a[k2])==given) {

							System.out.println(a[i]+""+a[j]+""+a[k]+""+a[k2]);
						}
					}
				}
			}
		}

	}

}
