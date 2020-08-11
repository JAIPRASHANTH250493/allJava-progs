package W3resources_ARRAY;

public class Sum_of_valuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,5,6,9,10};
		
		int temp=0;
		for (int i : a) {
			temp=temp+i;
		}
		System.out.println(temp);
		System.out.println(".........................................");
		String s="jai234";
		
	char c[]=	s.toCharArray();
	int temp2=0;
	for (char d : c) {
		if(Character.isDigit(d)) {
			
			temp2=temp2+Character.getNumericValue(d);
		}
	}
	System.out.println(temp2);
	}

}
