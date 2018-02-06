package hackerrank;

public class Encircle {
	  static String[] doesCircleExist(String[] commands) {
		  int countr=0;
		  int countl=0;
		  String[] ans = new String[commands.length];
		  for(int i=0;i<commands.length;i++){
			  countr=0;
			  countl=0;
			  for(int j=0;j<commands[i].length();j++){
				if(commands[i].charAt(j) == 'R'){
					countr++;
				}  
				else if(commands[i].charAt(j)=='L'){
					countl++;
					
				}
				  
				  
				  
				  
			  }
			  if(countr==countl){
				  ans[i]="NO";
			  }
			  else
				  ans[i]="YES";
			  
		  }
	        
       return ans;
	    }
	  
public static void main(String args[]){
	
	String[] mov = {"GRLGRLGRLL"};
	String[] ans =doesCircleExist(mov);
	for(String i: ans){
		
		System.out.println(i);
		
	}
	
}

}
