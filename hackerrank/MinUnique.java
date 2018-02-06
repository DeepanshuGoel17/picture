package hackerrank;

import java.util.*;

public class MinUnique {

	 static int getMinimumUniqueSum(int[] arr) {
		 //Vector <Integer> v= new Vector<Integer>(arr.length);
		 int [] v= new int[10];
         int j=0;
		 int count =0;
		 Arrays.sort(arr);
		 v[j]=arr[j] ;
		 //count = count+ v[j];
		 j++;
		 while(j < arr.length  ){
			 for(int i=j;i<arr.length;i++) {
				 //System.out.println("v at ::::" + j+ ":::::" +v[j]);
				 
				 if(v[j-1] == arr[i]){
					 
					 arr[i] =arr[i]+1;
					 break;
				 }
				 else
				 {//System.out.println("count :::: "+count);
					
					v[j]=arr[i];
					 System.out.println("v at ::::" + j+ ":::::" +v[j]);
					j++;
				
				 }
				 
			 }
			 
			 
			 
			 
		 }
		 for(int i:v){
			 
			 count =count+i;
		 }
		 
return count;
	    }
public static void main(String args[]){
	int x;
	int[] y ={2,2,4,5};
	x = getMinimumUniqueSum(y);
	System.out.println(x);
	
	
	
	
	
	
}
	
	
}
