package W3resources_ARRAY;


public class Leader_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {20,34,6,7,23,20,4,1};

for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		
		if(a[i]<=a[j]) {
			break;
			
		}
		if(j==a.length) {
			System.out.println(a[i]);
		}
	}
}
	}

}
