package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackLand {

	 static String electionWinner(String[] votes) {

		 String winner ="";
      List<String> name = new ArrayList<String>();
      for(String i : votes){
    	  
    	  if(!name.contains(i))
    	  name.add(i);
    	  
      }
      Collections.sort(name, Collections.reverseOrder());


      int [] vote = new int[name.size()];
      Arrays.fill(vote, 0);
		 for(int i =0;i<name.size();i++){
			for(int j = 0;j<votes.length;j++){
				if(name.get(i) == votes[j]){
					vote[i] = vote[i]+1;
				}
			}
			
		 }
		    for(int i =0;i<name.size();i++){
	             
	             System.out.println("Name:: "+ name.get(i)+" Vote::: " + vote[i]);
	             
	         }
			int max=0;
			for(int k: vote){
				max= Math.max(k, max);
			}
			int count =0;
			 for(int l: vote){
				 
				 if(max == l){
					 
					 break;
				 }
				 count++;
			 }
			 
		 winner = name.get(count);
		 
		 return winner;
	    }
public static void main(String args[]){
	String [] name ={"Alex","Michael","Harry","Dave","Michael","Victor","Harry","Alex","Mary","Mary"};
	String win = electionWinner(name);
	System.out.println(win);
	
	
}
	
}
