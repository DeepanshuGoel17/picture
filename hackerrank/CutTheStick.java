package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CutTheStick {
	
	static int[] cutSticks(int[] lengths) {
		List <Integer> list = new ArrayList<Integer>(lengths.length);
		Vector<Integer> siz= new Vector<Integer>();
		
		
		for(int i: lengths){
			
			list.add(i);	
			
		}
		siz.add(lengths.length);
		list.removeAll(Collections.singleton(0));// remove all zeroes if present
	     Collections.sort(list); // sort in ascending order
	        Integer smallest;
	        int j=1;
			while(!list.isEmpty()){
	        
	            smallest = list.get(0);  // get the smallest element
	            for(int i =0 ;i < list.size();i++)
	            {

	                list.set(i, list.get(i) - smallest);
	            }
	            
	        
	            list.removeAll(Collections.singleton(0)); // remove the elements which are zero after cutting the sticks
	            if(list.size()>0)
	            siz.add(list.size());
	            
	        }
 
			int[] ans =new int[siz.size()];
			for(int i =0;i<siz.size();i++)
				ans[i]=siz.get(i);
		
			
	return ans;
	
	}


	   
	
	
	public static void main(String args[]){
		
		int [] y = {5,4,4,2,2,8};
		
		int[] x = cutSticks(y);
		for(int i: x){
			
			System.out.println(i);
			
		}
		
	
	
	}
	}


