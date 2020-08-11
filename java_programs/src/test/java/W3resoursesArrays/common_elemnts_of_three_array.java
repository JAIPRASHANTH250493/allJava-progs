package W3resoursesArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class common_elemnts_of_three_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


ArrayList<Integer> common = new ArrayList<Integer>();
int array1[] = {2, 4, 4,55,666,7,5,3,4,56};
int array2[] = {2, 3, 4,4,57,10,3,4445,666,6,7,8, 8, 10, 16};
int array3[] = {4, 8, 14, 40,666,55,33,5,3,5,6};

Arrays.sort(array1);
Arrays.sort(array2);
Arrays.sort(array3);
	int x = 0, y = 0, z = 0;
	while (x < array1.length && y < array2.length && z < array3.length){
		if (array1[x] == array2[y] && array2[y] == array3[z]){
			common.add(array1[x]);
			x++;
			y++;
			z++;
		}
		else if (array1[x] < array2[y])
			x++;
		else if (array2[y] < array3[z])
			y++;
		else
			z++;
	}
	System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
System.out.println(common);
	}

}
