package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PowerSum {

static int countPowerNumbers(int l, int r) {
	int x = (int) Math.ceil(Math.sqrt(r));
	List<Long> li = new ArrayList<Long>();
	List<Long> ans = new ArrayList<Long>();
	//int[][] aar = new int[x][x];
    li.add((long)0);
    li.add((long)1);
     for(int i=2;i<=x;i++){
    	 for(int j=2;j<=x;j++){
             if((int)Math.pow(i,j)<=r)
    	li.add ((long)Math.pow(i,j));    	 
    	
    	 }
    	 }
      
   for(int i=0;i<li.size();i++){
    	 for(int j=0;j<li.size();j++){
    	 long c= li.get(i)+li.get(j);
    	 if(c>= l && c<=r){
    		 System.out.println("C:::" +c);
    		 if(ans.contains(c)){
    			 
    		 }
    		 else{
    			 ans.add((long)c);
    		 }
    	
    	 }
    	 
    	 
    	 
    	 
    	 }
    	 }	
    	 
     
     return ans.size();

    }
public static void main(String args[]){
	
	int y = countPowerNumbers(25,30);
	System.out.println(" Answer:::::" + y);
	
	
}
	
	

}
