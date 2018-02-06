package hackerrank;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class BuyTickets {

  
    static long waitingTime(int[] tickets, int p) {
        
        int time=0;
        List <Integer> li = new ArrayList<Integer>(tickets.length);
        li.add(tickets[p]);
      for(int  i= 0;i<p ;i++){
          tickets[i] =tickets[i]-1;
          
      }
        for(int i =0;i<tickets.length;i++){
            if(i==p){
                
            }
            else 
                li.add(tickets[i]);
            
        }
        if(p>0){
        time = p;
        }
        
    while(li.get(0)>1){
      
       li.removeAll(Collections.singleton(0));
        int size = li.size();
      
        time = time+size;
    
        for(int i =0;i<li.size();i++){
            
        
                li.set(i,li.get(i)-1);
        }
        
    }
      return time+1;
    }

}
