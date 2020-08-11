package W3resoursesArrays;

public class missing_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,5,6,7};
int b[]= {1,2,3,4,5,6,7};
int total=0;
int to=0;
int t=7*((7+1/2));
for (int i = 0; i < a.length; i++) {
	
	to=to+a[i];
	
}

for (int i = 0; i < b.length; i++) {
	total=total+b[i];
}
System.out.println(total-to);

	}

}
