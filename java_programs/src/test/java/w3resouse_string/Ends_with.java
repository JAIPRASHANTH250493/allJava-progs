package w3resouse_string;

import java.util.Calendar;

public class Ends_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hellojai";
		
	boolean b=	a.endsWith("ai");
	System.out.println(b);
	
	Calendar c=Calendar.getInstance();
	System.out.println(c.getCalendarType());
	
    System.out.println("Current Date and Time :"); 
    System.out.format("%tB %te, %tY%n", c, c, c);
    System.out.format("%tl:%tM %tp%n", c, c, c); 
	}

}
