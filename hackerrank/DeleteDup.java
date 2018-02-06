package hackerrank;

public class DeleteDup {
	public static int[] sort(int [] a,int d){
		int temp=0;
		int[] ans = new int[d];
		for(int i=0;i<d;i++){
			for(int j=i+1;j<d;j++){
			if(a[i]>a[j]){
				
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			
			}		
			}
		}
		
		for(int i =0;i<d;i++){
			ans[i]=a[i];
			
			
		}
		
		
		return ans;
	}
	public static boolean isContain(int[] a,int i){
		for(int j: a){
			if(j == i ){
				return true;
			}
		}
		return false;
	}
	public static int[] deletedup(int[] a, int[] b){ 
	 int ans[]  = new int[a.length+ b.length];
	 int h =0;
	 int k =0;
	 for(int i=0;i<a.length+b.length;i++){
		 if(i<a.length){
			 
			 ans[i] = a[i];
		 }
		 else{
			 ans[i] = b[h];
			 h++;
		 } 
	 }
	 	 
	int arr[] =new int[ans.length];
	 for(int i=0;i<ans.length;i++){
		 if(!isContain(arr,ans[i])){
		 arr[k]=ans[i];
		 k++;
	 }
	 }
	 int []arr1= sort(arr,k);
	 

		return arr1;
		
	}
public static void main(String args[]){
	int a[] ={-5,10,6,7,-5,-5,-5};
	int b[]={100,-5,6,70,1000,90,10};
	int c[] =deletedup(a,b);
	for(int i: c){
		
		System.out.println(i);
	}
}	
}
