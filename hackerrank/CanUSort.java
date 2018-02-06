package hackerrank;

import java.util.Arrays;

public class CanUSort {
	  static void customSort(int[] arr) {
		  int len = arr.length;
		          int count=0;
		          int max= 0;
		          
		          Arrays.sort(arr);
		          int freq[] = new int[arr[arr.length-1]+1];
		          
		          for(int i:arr ){
		        	//  System.out.println(i);
		        	  freq[i]=freq[i]+1;
		        	  
		          }
		          for(int i:freq){
		        	  
		        	  max= Math.max(max,i);
		        	  
		          }
		          for(int i=1;i<=max;i++){
		        	for(int j=0;j<freq.length;j++){
		        		
		        		if(freq[j]==i){
		        		for(int k=0;k<i;k++){
		        			System.out.println(j);
		        			
		        			
		        		}	
		        		}
		        		
		        	}  
		          
		          
		          }
		          }
		          
public static void main(String args[]){
	
	int[] x ={1,2,1,1,2,3,4,5,5,6,7,7,9,9};
	customSort(x);
	
}

}
