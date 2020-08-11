package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Print_in_reverseorder {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("jai");
		ar.add("india");
		ar.add("xya");
		ar.add("tm");
		ar.add("peter");
		ar.add("cts");
		
		ListIterator<String> it=ar.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("..................case 2......comparable.......");
		
		Comparable_class c1=new Comparable_class("jai",5,"india");
		Comparable_class c2=new Comparable_class("tom",9,"usa");
		Comparable_class c3=new Comparable_class("peter",2,"uk");
		Comparable_class c4=new Comparable_class("sushant",34,"mumbai,inida");
		Comparable_class c5=new Comparable_class("ligin",12,"america");
		
		ArrayList<Comparable_class> ar1=new ArrayList<Comparable_class>();
		ar1.add(c1);
		ar1.add(c2);
		ar1.add(c3);
		ar1.add(c4);
		ar1.add(c5);
		
		
		Collections.sort(ar1);
		
	for (Comparable_class comp : ar1) {
		System.out.println(comp.name);
	}
		
		
		
		
	}

}
