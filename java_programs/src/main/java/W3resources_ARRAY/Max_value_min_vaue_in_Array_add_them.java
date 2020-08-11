package W3resources_ARRAY;

public class Max_value_min_vaue_in_Array_add_them {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,8,100,50,40,25};

		int small=Integer.MAX_VALUE;
		int big=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<small) {
				small=a[i];
			}
			if(a[i]>big) {
				big=a[i];
			}
			
		}
		System.out.println(small);
		System.out.println(big);
		System.out.println(big-small);
	}

}
