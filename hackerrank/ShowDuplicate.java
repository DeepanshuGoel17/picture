package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ShowDuplicate {
	public static boolean isContain(int[] a,int i){
		for(int j: a){
			if(j == i ){
				return true;
			}
		}
		return false;
	}
	public static int[] showdup(int[] a, int[] b){
	 int ans[]  = new int[Math.min(a.length, b.length)];
	 int h =0;
	 for(int i :a){
		 for(int j: b){
			 if(i==j){
				if(!isContain(ans,i)){
				ans[h] = i;	
				h++;
				}
				}
		 }
	 }
	int arr[] =new int[h];
	 for(int i=0;i<h;i++){
		 arr[i]=ans[i];
		 
	 }
		
		return arr;
		
	}
public static void main(String args[]){
	int a[] ={-5,10,6,7,-5,-5,-5};
	int b[]={100,-5,6,70,1000,90,10};
	int c[] =showdup(a,b);
	for(int i: c){
		
		System.out.println(i);
	}
}	
}
