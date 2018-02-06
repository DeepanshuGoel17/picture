package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CandyShare {
	
	static long getCandies(long n, long p) {

       int a =(int) Math.sqrt(n);
        int siz= (int) p;
        long [] d = new long[siz];
     int j=0;
     if(p<=a)  
     {for(int i = 1; i<=n ;i++){
            int remain = (int) (n%i);
           // System.out.println("i :"+ i);
           //System.out.println("in ramina:"+remain);
            if(remain == 0){
                d[j] = i;
             //   System.out.println(d[j]);
                j++;
                
            }
                if(j == p){break;}
                
                    
       
        
        }
     }
     else{
    	 for(int i = 1; i<=n ;i++){
             int remain = (int) (n%i);
            // System.out.println("i :"+ i);
            //System.out.println("in ramina:"+remain);
             if(remain == 0){
                 d[j] = n/i;
              //   System.out.println(d[j]);
                 j++;
                 
             }
                 if(j == p){break;}
                 
                     
        
         
         }
    	 
    	 
    	 
     }
        return d[siz-1];
 
    }
	    
public static void main(String args[]){
	long n = getCandies(1,1);
	System.out.println(n);
}
}
