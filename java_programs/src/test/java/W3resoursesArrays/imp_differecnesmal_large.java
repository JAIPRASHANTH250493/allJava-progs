package W3resoursesArrays;

public class imp_differecnesmal_large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,6,4,10,8};
int small=Integer.MAX_VALUE;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		
	
	if(Math.abs(a[i]-a[j])<small) {
		small=Math.abs(a[i]-a[j]);
	}}
}
System.out.println(small);
	}

}
