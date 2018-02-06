package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Groups {
	static int minimalCost(int n, String[] pairs) {
		int ans = 0 ;
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> pair = new ArrayList<Integer>(); 
		int count =0;
		for(int i =0;i <pairs.length;i++){
			 String ss1 =pairs[i].split(" ")[0];
			  String ss2 =pairs[i].split(" ")[1];
			int x =Integer.parseInt(ss1);
			  int y =Integer.parseInt(ss2);
			  pair.add(x);
			  pair.add(y);
		}
	while(pair.size() != 0){
		li.clear();
		if(pair.get(0)!= pair.get(1)){
			li.add(pair.get(0));
			li.add(pair.get(1));
			pair.remove(0);
			pair.remove(0);}
	        else{
	            li.add(pair.get(0));
	            	pair.remove(0);
			        pair.remove(0);
	        }
		int siz =pair.size();
		int siz2 =li.size();
	for(int i=0;i<4;i++){
		siz2=li.size();
		for(int j =0;j<siz;j=j+2){
			int ss1=pair.get(j);
			int ss2=pair.get(j+1);
			  if(li.contains(ss1) && !li.contains(ss2)){ 
				  pair.remove(j);
				  pair.remove(j);
				  j=j-2;
				  li.add(ss2);
				  siz =pair.size();
				  siz2 =li.size();
			  }
			  else if(li.contains(ss2) && !li.contains(ss1)){
			  li.add(ss1);
				  pair.remove(j);
				  pair.remove(j);
				  j=j-2;
				  siz =pair.size();
				  siz2 =li.size();
			  }
			  else if(li.contains(ss2) &&li.contains(ss1) ){
				  pair.remove(j);
				  pair.remove(j);
				  j=j-2;
				  siz =pair.size();
			  }
		}
		}
		 count =count+1;;
	}
	 ans = count;
	return ans;
	}
	 static int Group(String[] grid) {
	//String [] pair = new String [zombies.length*zombies.length];
	List<String> pair = new ArrayList<String>();
	int k=0;
	for(int i =0; i< grid.length;i++){
		for(int j =0;j<grid[i].length();j++){
			if(grid[i].charAt(j) == 'Y'){
				int x=i+1;
				int y=j+1;
				String s = x+" "+y;
				pair.add(s);	
				
			}
			
		}
			
	}
	
	String[] s = new String[pair.size()];
	
	for(int i =0;i<pair.size();i++){
		s[i] = pair.get(i);
		System.out.println("PAIR::::" + pair.get(i));
	}
	int s2= minimalCost(grid[0].length(),s);

	int ans=0;
	
	
	return s2;
		

}
public static void main(String args[]){
	String[] que ={"YNNY","NYNY","NYNN"};
	int x = Group(que);
	System.out.println(x);
}
}
