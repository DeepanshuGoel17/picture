package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class NuclearRods {

	static int minimalCost(int n, String[] pairs) {
		int ans = 0 ;
		int count1=0;
		int count2 =0;
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> pair = new ArrayList<Integer>(); 
		int count =0;
		for(int i =0;i <pairs.length;i++){
			System.out.println("hi inside for loop");
			 String ss1 =pairs[i].split(" ")[0];
			  String ss2 =pairs[i].split(" ")[1];
			  System.out.println("ss1:::"+ ss1 +" s2::: "+ss2);  
			int x =Integer.parseInt(ss1);
			  int y =Integer.parseInt(ss2);
			  pair.add(x);
			  pair.add(y);
			
		}
		/* for(int k=0;k<pair.size();k++){
			 System.out.println("List item: "+k+"  ::"+pair.get(k));
			 
		 }*/
	
	while(pair.size() != 0){
		
		System.out.println("hi inside another for loop");
		li.clear();
		li.add(pair.get(0));
		li.add(pair.get(1));
		pair.remove(0);
		pair.remove(0);
		int siz =pair.size();
		/* for(int k=0;k<pair.size();k++){
			 System.out.println("List item: iniside "+k+"  ::"+pair.get(k));
			 
		 }*/
		
		//System.out.println("hi inside another for loop size ::::"+ siz);
		for(int j =0;j<siz;j=j+2){
			
			int ss1=pair.get(j);
			int ss2=pair.get(j+1);
		//	System.out.println("hi outside if:: "+ss1);
		//	System.out.println("hi outside if:: "+ss2);
			  if(li.contains(ss1)){ 
					System.out.println("hi inside if:: "+ss2);
				  pair.remove(j);
				  pair.remove(j);
				  j=j-2;
				  li.add(ss2);
				  siz =pair.size();
				  for(int k=0;k<pair.size();k++){
						 System.out.println("List item: iniside::if "+k+"  ::"+pair.get(k));
						 
					 }
				  
			  }
			  else if(li.contains(ss2)){
					System.out.println("hi inside if:: "+ss1);
				  li.add(ss1);
				  pair.remove(j);
				  pair.remove(j);
				  j=j-2;
				  siz =pair.size();
				  for(int k=0;k<pair.size();k++){
						 System.out.println("List item: iniside ::if"+k+"  ::"+pair.get(k));
						 
					 }
			  }
			  
			  
			
		}
		 count = li.size();
		 count1 = count+count1;
		 count2= (int) (count2+Math.ceil(Math.sqrt(count)));
		 ans = n-count1+count2;
		 
	}
	
	return ans;
	}
	
	
	public static void main(String args[]){
	int x;
	String [] s ={"8 1","5 8","7 3","8 6"};
	int siz =8;
	x= minimalCost(siz,s);
	System.out.println(x);
	
}

}
