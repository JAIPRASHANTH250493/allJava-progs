package String_Programs;

public class Each_word_first_lettertoupperase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String given="hello im jaiprashanth hw are you";
char ch[]=given.toCharArray();

for(int i=0;i<ch.length;i++) {
	if(ch[i]==' ') {
	ch[i+1]=(char)(ch[i+1]-32);
	}
System.out.println(ch);
}
}
	

}
