package hackerrank;

public class Group {
	  static int group(String[] grid) {
     int count =0;
     for(int i =0;i<grid.length;i++){
    	for(int j=0;j<grid.length;j++){
    	 if(grid[i].charAt(j) =='Y' ){
    		for(int k=1;k<grid.length;k++){
    			if(grid[i].charAt(j+k) == 'N' ){
    				
    			}
    			
    			
    		} 
    		
    		 
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
    	}
     }
     return count; 
	  }

	  public static void main(String args[]){
		  String []arr ={"YNNY","NYNY","NYNN"};
		  int x = group(arr);
		  System.out.println(x);
	  }
}
