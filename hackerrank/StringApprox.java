package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringApprox {
	

	public static int match(String a,String b){
		int ans=0;
		int i=0;
		int j=0;
		while(i<a.length() && j<b.length())
		{
            String a1=String.valueOf(a.charAt(i));
            String a2=String.valueOf(b.charAt(j));
			if(a1.equalsIgnoreCase(a2)){
				System.out.println("A::;"+a1+"B:::::"+a2);
				ans++;
				i++;
				j++;
				System.out.println("I:"+i+"::J::"+j);
			}
			else{
				ans=0;
			i++;
			}
			
		}
		return ans;
	}
	
	
	
	  static String calculateScore(String text, String prefix, String suffix) { 
	        List<String> li = new ArrayList<String>();
           
            for(int i =0;i<text.length();i++){
            	li.add(text.substring(i));
            	
            }
            for(int i =text.length();i>=0;i--){
            	li.add(text.substring(0,i));
            	
            }
            int [] arr= new int[li.size()];
           Collections.sort(li);
           for(int i=0;i<li.size();i++){
        	   int x=match(prefix,li.get(i));
        	   int y=match(li.get(i),suffix);
        	   arr[i]=x+y;
           }
           int max=0;
           int index=0;
           for(int i=0;i< arr.length;i++){
        	   if(max<arr[i]){
        		   max= arr[i];
        		   index=i;
        		   }
           }
           for(int i=0;i<arr.length;i++){
        	   
        	   System.out.println("LISt ITEM::" +li.get(i)+" :::ARR:::"+arr[i]);
        	   
           }
           return li.get(index);
           
	    }
public static void main(String args[]){
	String a ="Deepanshu";
	String su="Deeanshu";
	String pre="atpan";
	String ans =calculateScore(a,pre,su);
	System.out.println(ans);
	
	
}

}
