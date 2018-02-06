package hackerrank;

import java.util.Arrays;

public class SimpleQuery {
	
	  static int[] counts(int[] nums, int[] maxes) {

	        int count=0;
	        int [] ans =new int[maxes.length]; 
	       Arrays.sort(nums);
	     
	        return ans;
	    }
public static void main(String args[]){
	
int [] num ={1,4,2,4};
int[] maxe = {3,5,};
int [] ans = new int[2];
ans =counts(num,maxe);
for(int i: ans){
	
	System.out.println(i);
	
	
}
	
	
	
}
}