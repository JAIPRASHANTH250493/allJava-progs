package W3resources_ARRAY;

public class Odd_EVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {-9,4,5,-8,-9,-44,8,7,-8};
int even=0;
int odd=0;

for (int i : a) {
	if(i>0) {
		even++;
	}if(i<0) {
		odd++;
	}
}
System.out.println(even+"  "+odd);
	}

}
