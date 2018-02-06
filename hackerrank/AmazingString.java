package hackerrank;

public class AmazingString {
	  static int[] minimalOperations(String[] words) {
		  int [] ans= new int[words.length];
		  int count=0;
	        for(int i =0;i<words.length;i++){
	        	char [] test = words[i].toCharArray();
	            for(int j =1;j<words[i].length();j++){
	            	
	            	if(test[j-1] == test[j]){
	            		count++;
	            	test[j] = 'A'; 
	            	}
	            }
	            
	           ans[i] = count;
	        count  =0;
	        }
	        return ans;
	    }
public static void main(String args[]){
	String [] s1 = {"ab","aab","abb","abab","abaaaba"};
	
	int [] x =minimalOperations(s1); 
	for(int i : x){
		System.out.println(i);
	}
	
	
}
	
}
