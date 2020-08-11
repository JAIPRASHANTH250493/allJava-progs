package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;

public class comparator_implemets {

	public static void main(String[] args) {
	
		Comparator_class c1=new Comparator_class("jai",4,"india");
		Comparator_class c2=new Comparator_class("peter",55,"UK");
		Comparator_class c3=new Comparator_class("tom",84,"canada");
		Comparator_class c4=new Comparator_class("sushant",44,"Australia");
		Comparator_class c5=new Comparator_class("vicky",7,"Italy");
		
		ArrayList<Comparator_class> ar1=new ArrayList<Comparator_class>();
		ar1.add(c1);
		ar1.add(c2);
		ar1.add(c3);
		ar1.add(c4);
		ar1.add(c5);
		for (Comparator_class comp : ar1) {
			System.out.println(comp.name);
		}
Collections.sort(ar1, c1);

for (Comparator_class com : ar1) {
	System.out.println(com.name);
}
	}

}
