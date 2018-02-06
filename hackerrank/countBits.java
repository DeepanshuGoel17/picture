package hackerrank;

public class countBits {
	 static int[] getOneBits(int n) {
	        
		 String s1= Integer.toBinaryString(n);
		 
		 int [] ans = new int[s1.length()];
		 int count=0;
		 int j=1;
		 for(int i =0;i<s1.length();i++){
			 if(s1.charAt(i)=='1' ){
				 
				 ans[j] =i+1;
				
				 System.out.println(" j:::::: "+ans[j]);
				 j++;
				 count++;
				 
			 }
			 
			
			 
			 
			 
		 }
 ans[0] = count;
		 System.out.println("   0  :"+ans[0]);
		int [] ans2 = new int[count+1];
		for(int i=0;i<count+1;i++){
			ans2[i] =ans[i];
			
		}
		 
		 return ans2;
	    }
public static void main(String args[]){
	
	int [] x;
	x = getOneBits(161);
	for(int i:x){
		
		System.out.println(i);
		
	}
	
	
}

}
