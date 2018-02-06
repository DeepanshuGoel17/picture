package hackerrank;

public class MagicalVowel {
		  static int longestSubsequence(String s) {
			  int count2 = 0;
	   //char [] vowel = {'a','e','i','o','u'};
		  int count =0;
		  
	  for(int i=0;i<s.length();i++ ){
		
		  if(s.indexOf('a')<0 ||s.indexOf('e')<0 ||s.indexOf('i')<0 ||s.indexOf('o')<0 ||s.indexOf('u')<0 ){
			  
			  return 0;
			  
		  }
		  }
		  char[] at = new char[s.length()];
				 at = s.toCharArray();
		  int[] num =new int[s.length()];
		  for(int i=0; i<s.length();i++) {
			  
			 num[i] =(int)at[i];
		  System.out.println(num[i]+"  : "+ at[i]);
		  
		  }
		  int counter = 97;
		  int j;
		  for(j=0;counter!=num[j];j++){}
		  
		  for(int i =j;i<s.length();i++){
			  if(counter <= num[i] ){
				  count++;
					 
					  counter = num[i];
					  
				  }
			  if(j< s.length()){
			String s1 = s.substring(j+1);
				 count2 = longestSubsequence(s1);  
			  }
				System.out.println(count);
		  }
			  
			
			  
			  int max = Math.max(count, count2);
		  
		  return max;
		  
	  } 
	   
	  
	   
	   
	  
public static void main(String args[]){
	
	String a  = "aeiioooaauuaiou";
	int x= longestSubsequence(a);
	//System.out.println(x);
	
	
	
}
	
}
