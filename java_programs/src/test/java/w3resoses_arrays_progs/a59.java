package w3resoses_arrays_progs;

public class a59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2, 3, 5, 7, -7, 5, 8, -5 };
		int prodct=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int k = i+1; k < a.length; k++) {

				if(Math.abs(a[i]*a[k])>prodct){
					prodct=Math.abs(a[i]*a[k]);
				}
			}
		}
System.out.println(prodct);
	}
}
