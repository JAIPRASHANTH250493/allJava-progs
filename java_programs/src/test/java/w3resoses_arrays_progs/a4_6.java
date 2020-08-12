package w3resoses_arrays_progs;

public class a4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,19,1,22,-2,5,6,8,9,11};
int f=20;

for (int i = 0; i < a.length; i++) {
	for (int k = i+1; k < a.length; k++) {
		if(a[i]+a[k]==f) {
			System.out.println(a[i]+" "+a[k]);
		}
	}
}
	}

}
