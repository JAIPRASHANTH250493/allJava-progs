package W3resoursesArrays;

public class longest_consequestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,8,4,2,3,4,5,6,0,10};
		for (int i = 0; i < a.length; i++) {
			if(a[i]-a[i+1]==1) {
				System.out.println("  "+a[i]);
			}


		}
	}
}

