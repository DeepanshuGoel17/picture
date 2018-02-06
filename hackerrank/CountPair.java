package hackerrank;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class CountPair {
	

	  static int countPairs(int[] numbers, int k) {
	   int max=0;
	   int count=0;
		  for(int i: numbers){
	    	
	    	max=Math.max(i, max);
	    }
		  boolean [] arr =new boolean[max+1];
		  boolean [] arr1 =new boolean[max+k+1];
		  for(int i: numbers){
			  arr[i]=true;
			  arr1[i+k] =true;
			 }
		
			  for(int j =i+k;j<max+k+1;j++){
				  
				  if(arr[j]==arr1[j]){
					  
					  count++;
				  }
			  }
				  
				  
			  
			  
			  
			  
			  
		  
		  
	         return count;
	         
		    }
public static void main(String args[]){
	int[] number={1,3,5,9};
	int k=2;
	int x= countPairs(number,k);
	System.out.println(x);
	
}

}
