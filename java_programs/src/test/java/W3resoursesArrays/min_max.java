package W3resoursesArrays;

public class min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,86,6,9,10,11,13,14,14};
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>min&&a[i]<min2) {
				min2=a[i];
			}
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println("max = "+max);
		System.out.println("min=  "+min);
		System.out.println("secondmin ="+ min2);
	}

}
