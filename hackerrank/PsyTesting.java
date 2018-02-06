package hackerrank;

public class PsyTesting {

	  static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		  int [] ans=  new int[lowerLimits.length];
          int count =0;
		  for(int i =0;i<lowerLimits.length;i++){
			for(int j: scores){
				if(j>=lowerLimits[i] && j<=upperLimits[i] ){
					
					count++;
				}
				
				
				
			}
			 ans[i]= count;
			 count =0;
		  }
return ans;
	    }
public static void main(String args[]){
int[]  sc ={4,8,7};
int[] low ={2,4};
int[] high ={8,4};
int [] x= jobOffers(sc,low,high);
for(int i : x){
	System.out.println(i);
	
}
}
}