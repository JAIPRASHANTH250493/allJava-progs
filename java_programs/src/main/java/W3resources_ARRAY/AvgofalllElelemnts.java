package W3resources_ARRAY;

import java.util.ArrayList;

public class AvgofalllElelemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5};
		
		int b=a.length;
		int t=0;
		for (int i : a) {
			if(i==3) {
				System.out.println("number fournd ");
			}
			t=t+i;
		}
		System.out.println(t);
		int t1=t/b;
		System.out.println(t1);
		
		ArrayList<Integer> in=new ArrayList<Integer>();
		for (int i : a) {
			if(i==5) {
				System.out.println("number remobved"+""+i);
			}
			else {
				in.add(i);
			}
		}
			System.out.println(in);
		
		
	}

}
