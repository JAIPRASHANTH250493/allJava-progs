package w3resoursesString_prgs;

public class s36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="PNOQEI";
String s1="POE";
String s2="NQI";
char c[]=s1.toCharArray();
char c1[]=s2.toCharArray();
String n="";
for (int i = 0; i <3 ; i++) {
	n=n+c[i];
	n=n+c1[i];;
	
}
System.out.println(n);
if(n.equals(s)==true) {
	System.out.println("yes interleaving");
}
	}

}
