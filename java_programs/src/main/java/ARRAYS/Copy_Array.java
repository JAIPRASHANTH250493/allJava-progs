package ARRAYS;

public class Copy_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,5,4,6,7,4};
int b[]= new int[a.length];
for(int i=0;i<a.length;i++) {
	b[i]=a[i];
}
System.out.println(b);

for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
}
	}

}
