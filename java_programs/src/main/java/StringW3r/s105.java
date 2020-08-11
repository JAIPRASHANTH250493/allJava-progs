package StringW3r;

public class s105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="abcd abc aabc baa abcaa";
String f="aa";
int count=0;
String[] s=a.split(" ");

for (String string : s) {
	System.out.println(string);
	if(string.contains(f)) {
		count++;
		
	}
}
System.out.println(count);
	}

}
