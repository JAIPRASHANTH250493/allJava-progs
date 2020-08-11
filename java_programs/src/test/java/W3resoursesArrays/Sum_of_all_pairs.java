package W3resoursesArrays;

public class Sum_of_all_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,10,20,-50,60,30};

for (int i = 0; i < a.length; i++) {
	
	if(Math.abs(a[i]+a[i+1])==30) {
		
		
		System.out.println(a[i]+"  "+a[i+1]);
	}
}
	}

}
