package w3resoses_arrays_progs;

public class a24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,5,6};
int t=0;
for (int i = 0; i < a.length; i++) {
	t=t+a[i];
}

int t1=a.length+1;
int t2=0;
for (int i = 1; i <=t1; i++) {
	t2=t2+i;
}
System.out.println(t2-t);


	}

}
