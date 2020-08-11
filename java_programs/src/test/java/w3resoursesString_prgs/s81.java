package w3resoursesString_prgs;

public class s81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="redcapmanwithbluecarblueredbluejbjdred";

for (int i = 0; i < s.length()-4; i++) {
	
	if(s.substring(i, i+3).equals("red")) {
		System.out.println(s.substring(i, i+3));
	}
	if(s.substring(i, i+4).equals("blue")) {
		System.out.println(s.substring(i, i+4));

	}
	
	
}
	}

}
