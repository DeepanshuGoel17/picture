package hackerrank;

public class Binary {	
	public static boolean binary(int [] arr,int low,int high,int x)
	{
		int mid = low+high/2;
		if(low>=high || high >= arr.length)
		{
			return false;
	 }
		
	 else{
			 if(arr[mid] == x) 
			 {
			 System.out.println("hiiiii");
			 return true;
		     }
		 else
		 { 	 //System.out.println("helloooooo");
			boolean t= binary(arr,low,mid-1,x)||binary(arr,mid+1,high,x) ;
			 return t;
		 }
 }
		}
public static void main(String args[]){
	int[] number={6,9,6,9,9,3,5,5,6};
	
if(binary(number,0,number.length,6))
	System.out.println("hiiii");
	
}


}
