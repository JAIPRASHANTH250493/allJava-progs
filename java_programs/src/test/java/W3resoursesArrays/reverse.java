package W3resoursesArrays;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12345;
int rev=0;
while(a!=0) {
	
	rev=rev*10+a%10;
	a=a/10;
}
System.out.println(rev);
	}

}
