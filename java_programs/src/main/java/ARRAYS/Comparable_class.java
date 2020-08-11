package ARRAYS;

public class Comparable_class implements Comparable<Comparable_class>{
	
	String name;
	int age;
	String place;
	Comparable_class(String name,int age,String place){
		this.name=name;
		this.age=age;
		this.place=place;
	}
	public int compareTo(Comparable_class o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
	
	

}
