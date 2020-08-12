package w3resoses_arrays_progs;

import java.util.Arrays;

public class s56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,1,1,0,0,1,0,1,0,1,1};

int t=0;
for (int i = 0; i < a.length; i++) {
	for (int k = 0; k < a.length; k++) {
		if(a[k]!=0) {
			t=a[i];
			a[i]=a[k];
			a[k]=t;
	}
	}
}
System.out.println(Arrays.toString(a));
	}

}
