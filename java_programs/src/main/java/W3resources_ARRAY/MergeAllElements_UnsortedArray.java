package W3resources_ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeAllElements_UnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,5,7,9,10};
int b[]= {1,3,6,8};

int alen=a.length;
int blen=b.length;

Set<Integer> s=new TreeSet<Integer>();

for (Integer in : a) {
	s.add(in);
}
for (Integer in : b) {
	s.add(in);
}

for (int i = 0; i < b.length; i++) {
	
}

System.out.println(Arrays.toString(a));
System.out.println(s);



	}

}
