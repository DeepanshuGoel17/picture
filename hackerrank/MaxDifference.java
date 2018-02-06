package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MaxDifference {

	static int maxDifference(int[] a) {
		int min =-1;
		int mina=-1;
		int j=0;
    	int h=0;
        int dif;
        int min1 =a[0];
            int max1=a[0];
           int minplace=0;
           int maxplace=0;
        for(int i: a){
            
            min1=Math.min(min1,i);
            
            max1=Math.max(max1,i);
           
            
        } 
        
        for(int i :a){
        	
        	if(min1== i){
        		
        		minplace= j;
        		
        	}
        	if(max1==i){
        		
        		maxplace = h;
        		
        		
        	}
        	
        	j++;
        	h++;
        	
        }
        for(int i=0;i<h;i++){
        	dif=max1-a[i];
        	
        	if(dif>0)
        	mina =Math.max(dif, mina);
        	}
        for(int i = j;j<a.length;i++){
        	dif=a[i]-min1;
        	if(dif>0)
        	min =Math.max(dif, min);
        	
        	
        }
        
        int min2=-1;
        min2 = Math.max(min,mina);

        return min2;
	    }

	
	
	
	
	public static void main(String args[]){

		
		
	}

}
