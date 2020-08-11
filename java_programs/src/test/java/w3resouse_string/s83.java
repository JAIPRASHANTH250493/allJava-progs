package w3resouse_string;

public class s83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="w3resource";
		String s="welcome";
		//wwe3lrceosmoeurce

		int j=0;
		int k=0;
		char[]c=s.toCharArray();
		char c1[]=s1.toCharArray();

for (int i = 0; i < Math.max(s.length(),s1.length()); i++) {
	
	if(j<s.length()) {
		System.out.print(c[j]);
		j++;
	}
	if(k<s1.length()) {
		System.out.print(c1[k]);
		k++;
	}
	
}

	}

}
