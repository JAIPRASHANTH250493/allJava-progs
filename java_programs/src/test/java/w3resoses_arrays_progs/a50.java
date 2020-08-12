package w3resoses_arrays_progs;

import java.util.Arrays;

public class a50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50,60,(10+60),80,90,100};
int b[]=new int[a.length];

int t=0;
int big=a.length-1;

boolean bo=true;
for (int i = 0; i < b.length; i++) {
	
	if(bo)
		b[i]=a[big--];
	else
		b[i]=a[t++];
	bo=!bo;
	
}


System.out.println(Arrays.toString(a));


	}

}
