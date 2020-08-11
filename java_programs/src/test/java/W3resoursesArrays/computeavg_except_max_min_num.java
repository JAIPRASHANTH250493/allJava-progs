package W3resoursesArrays;

public class computeavg_except_max_min_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};

		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int t=0;
		int avg=a.length-2;

		for (int i = 0; i < a.length; i++) {

			t=t+a[i];
			if(a[i]>max) {
				max=a[i];

			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		int num=t-max-min;
		System.out.println(num/avg);
	}

}
