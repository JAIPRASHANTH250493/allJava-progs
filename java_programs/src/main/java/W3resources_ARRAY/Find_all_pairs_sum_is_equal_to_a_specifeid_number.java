package W3resources_ARRAY;

public class Find_all_pairs_sum_is_equal_to_a_specifeid_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,6,9,10,-20,30};
		int b[]= {1,3,4,6,10,-20,30};

		
		int pairednum=10;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]+a[j]==pairednum) {
					System.out.println("paired numbers are"+"  "+a[i]+"  "+a[j]+"="+"  "+"10");
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				System.out.println("array are notqual");
				break;
			}else if(a[i]==b[i]){
				
				System.out.println("array areequal");
			}
		}

	}

}
