package w3resoursesString_prgs;

public class s97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="w3resource.com";
		
		//012 34  567  89
		char c[]=s.toCharArray();
		
		int count=0;
		for (int i = 0; i < c.length; i++) {
			count++;
			
			if(count!=4&&count!=5) {
				
				System.out.print(c[i]);
				
			}
			if(count==5) {
				count=0;
			}
		}
	}

}
