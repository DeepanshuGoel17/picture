package hackerrank;

public class StringSimilarty {
	   static int []stringSimilarity(String[] inputs) {
		   
		   int count;// to get count
		   int [] ans = new int[inputs.length];// to store our answer
		   int j=1;//to make substring
		   int h=0;//to iterate in 
		   
		   
		   for(int i =0;i<inputs.length;i++){
			   String s1= inputs[i];
			
			  
			   count =0;
			   while(j<s1.length()){
				 
				   String s2=s1.substring(j);
				   System.out.println("AT substring :: " +s2+"::::::And string is::::" +s1);
				   if(s1.charAt(h) == s2.charAt(h) && h < s2.length()){
					   count++;
					   h++;
					   System.out.println("count:: "+count +" :::h is:::  " +h);
					   
				   }
				   else{
				   j++;
				   h=0;
				   }
				   if(h == s2.length()){
					   h=0;
					   j++;
					   
				   }
			   }
			   
			   
			   ans[i] =count+s1.length();
			   
			   j=1;
			  
			   
			   
		   }
		   
		   
		   
		   
		   
		   
	       return ans;
	    }

	   
	   
	   
	   
	   
	   
	   
	   public static void main(String args[]){
	int [] x= new int [4];
	String [] a= {"ababaa"};
	x= stringSimilarity(a);
	for(int i:x){
		
		System.out.println(i);
	}
	
	
	
}

}
