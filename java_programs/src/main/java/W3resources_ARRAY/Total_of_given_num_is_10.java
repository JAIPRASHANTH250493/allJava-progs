package W3resources_ARRAY;

public class Total_of_given_num_is_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,10,9,7,8,10,11,10,13,10};
int total=0;
int t=30;
for (int i = 0; i < a.length; i++) {
	if(a[i]==10) {
		total=total+a[i];
	}
}

if(total==t) {
	System.out.println("equal"+total+" "+t);
}
else {
	System.out.println("notequal");
}
	}

}
