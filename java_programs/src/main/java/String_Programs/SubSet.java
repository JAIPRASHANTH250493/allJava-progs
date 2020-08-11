package String_Programs;

public class SubSet {
	 public static void main(String[] args) { // TODO Auto-generated method stub
	  
		   String str = "FUN";  
	        int len = str.length();  
	        int temp = 0;  
	        //Total possible subsets for string of size n is n*(n+1)/2  
	        String arr[] = new String[len*(len+1)/2];  
	  
	        //This loop maintains the starting character  
	        for(int i = 0; i < len; i++) {  
	            //This loop adds the next character every iteration for the subset to form and add it to the array  
	            for(int j = i; j < len; j++) {  
	                arr[temp] = str.substring(i, j+1);  
	                temp++;  
	            }  
	        }  
	  
	        //This loop prints all the subsets formed from the string.  
	        System.out.println("All subsets for given string are: ");  
	        for(int i = 0; i < arr.length; i++) {  
	            System.out.println(arr[i]);  
	        }

	String given = "jaia";
	int leng = given.length();
	int tempe = 0;
	String ar[]=new String[leng*((leng+1)/2)];
	for(
	int i = 0;i<leng;i++)
	{
		for (int j = i; j < leng; j++) {
			ar[tempe] = given.substring(i, j + 1);
			tempe++;
		}

	}
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
}

}
