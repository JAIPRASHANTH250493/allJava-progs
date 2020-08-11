package StringW3r;

public class s105_Occurnce_of_ceratinChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="My high school, the Illinois Mathematics and Science Academy, "
	            + "showed me that anything is possible and that you're never too young to think big. "
	            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
	            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
	            + "computer science.";
		
		int count=0;
		char c[]=s.toCharArray();
		for (char d : c) {
			
			if(d=='e') {
				count++;
			}
		}
System.out.println(count);
	}

}
