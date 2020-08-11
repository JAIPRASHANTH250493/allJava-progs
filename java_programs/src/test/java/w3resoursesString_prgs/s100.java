package w3resoursesString_prgs;

public class s100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="jai hello njcn jeelos  hellos";
		String c[]=s.split(" ");
		
		for (int i = 0; i < c.length; i++) {
			
			if(c[i].equals("hellos")) {
				System.out.println("preset");
			}
		}
	}

}
