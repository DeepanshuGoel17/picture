package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwo {
	 static int numberOfPairs(int[] a, long k) {
		 int ans =0;
		 List<Integer> li= new ArrayList<Integer>();
		 List<Integer> li2= new ArrayList<Integer>();
		 for(int i: a){
			 
			 if(li.contains(i)){
				 
				 if(!li2.contains(i)){
					 li2.add(i);
					 
				 }
				 
			 }
			 else{
				 li.add(i);
				 
			 }
		 }
for(int i =0;i<li.size();i++){
	for(int j =i+1;j<li.size();j++){
		long c = li.get(i)+li.get(j);
		if(c == (int)k){
			ans++;
		}
	}
}
for(int i=0;i<li2.size();i++){
	int c= li2.get(i)+li2.get(i);
	if(c == (int)k){
		ans++;
	}
}		 
		 
		 
		 return ans;
	    }
public static void main(String args[]){
	int[] x= {1,3,1,46,1,5,9,44};
	long k =47;
	int ans = numberOfPairs(x,k);
	System.out.println(ans);
}

}
