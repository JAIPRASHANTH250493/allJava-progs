package ARRAYS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(d);
		s.add(e);
		
		for(char ab='a';ab<='z';ab++) {
			System.out.print(ab+"  ");
			
		}
		
	
	}

}
