package w3resoursesString_prgs;

public class s95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello123";
char c[]=s.toCharArray();
String sum="";
int sum1=0;
for (int i = 0; i < c.length; i++)  {
	if(Character.isDigit(c[i])==true) {
		System.out.println(c[i]);
	sum=	s.substring(i, i+1);
	int s1=	Integer.parseInt(sum);
		
		sum1=sum1+s1;
	
	}
}
System.out.println(sum1);
	}

}
