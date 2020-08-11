package String_Programs;

public class SubSetofStrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String given="jai";
int l=given.length();
String ar[]=new String[l*((l+1)/2)];

int temp=0;
for(int i=0;i<l;i++) {
	for(int j=i;j<l;j++) {
		ar[temp]=given.substring(i, j+1);
		temp++;
	}
}
for(int i=0;i<ar.length;i++) 
{
	System.out.println(ar[i]);
}

	}

}
