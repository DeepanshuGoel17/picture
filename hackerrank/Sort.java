package hackerrank;

import java.util.Arrays;

public class Sort {
	 static void Sort(int[] arr) {
		  int max1=0;
		  int max2=0;
		  for(int i:arr){
			  max1=Math.max(max1,i);
			  
			  
		  }
		  int freq[] =new int[max1+1];
		  for(int i: arr){
			  
			  freq[i]++;
			  
		  }
		  for(int i=0;i<freq.length;i++){
			  
			  if( freq[i] >0){
				  System.out.println(i);
			  }
			  
			  
		  }
          
	 
	 }
	 public static void main(String args[]){

			int[] x ={9,8,7,4,2,3,123,23,4,2,341};
			Sort(x);	 
		 
		 
		 
	 }

}
