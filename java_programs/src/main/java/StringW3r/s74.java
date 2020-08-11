package StringW3r;

public class s74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="mrsnnmrsmrsmrsknfmrs";

String find="mrs";
int sl=s.length();
int fl=find.length();

String news=s.replaceAll("mrs", "");
int newss=news.length();
System.out.println("mrs appear"+sl/fl);

if((sl/fl)>2) {
	System.out.println("mrs appears more than one tym");
}
	}

}
