package w3resoses_arrays_progs;

import java.util.ArrayList;
import java.util.Arrays;

public class a20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,8,33,5,3};
int b[]=new int[a.length];

ArrayList<Integer> ar=new ArrayList<Integer>();
for (int i = 0; i < a.length; i++) {
	ar.add(a[i]);
}
System.out.println(ar);

for (int i = 0; i < ar.size(); i++) {
	b[i]=ar.get(i);
}
System.out.println(Arrays.toString(b));
	}

}
