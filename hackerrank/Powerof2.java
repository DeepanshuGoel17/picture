package hackerrank;

public class Powerof2 {
    static int[] isPowerOf2(int[] nums) {
        int[] ans= new int[nums.length];
      int counter =1;
        for(int i=0;i<nums.length;i++){
        	counter=1;
            if(nums[i]>=1){
        while(nums[i]>1){
        	if(nums[i]%2 == 0){
        		
        		nums[i] =nums[i]/2;
        		
        	}
        	else
        	{ 
        		counter=0;
        	   break;	
        	}
        }
            }
            else{counter =0;}
        ans[i] =counter;
        }
        return ans;
    }


	public static void main(String args[]){

		int [] num = {4,8,3};
		int[] x= isPowerOf2(num);

		for(int i:x){
			
			System.out.println(i);
			
		}
}
}