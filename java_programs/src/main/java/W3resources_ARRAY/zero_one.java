package W3resources_ARRAY;

import java.util.Arrays;

public class zero_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,0,0,1,1,1,0,0,1,0,1};


int temp=0;

for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(a[j]==0) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println(Arrays.toString(a));
	}

}
