package String_Programs;

public class RotationofAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="jaiprashanth";
		String given2="prashanthjai";
		String newstring=given.concat(given);
		if(newstring.contains(given2)) {
			System.out.println("itis roatational");
		}else {
			System.out.println("not a rotational string");
		}
	}

}
