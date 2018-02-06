package hackerrank;

import java.io.*;
import java.util.Scanner;

 class Listt{
	
	long arr[];
	Listt(int n){
		arr = new long[n];
		for(int i =0; i<n;i++){
			arr[i] =0;
		}
	}
void add(int a1,int b1,long c1){
		
		for(int i=a1-1;i<b1;i++){
			this.arr[i] =this.arr[i] + c1; 
			
		}
		
	}
long max(){ 
   long maxx=0;
	
	for(long i : this.arr){
		maxx= Math.max(i,maxx);
		
	}
	return maxx;
}
	
	
	
	
}
public class ListMax {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Scanner inn = new Scanner(System.in);
    String s1 =inn.nextLine();
    String [] s2  =new String[2];
    s2 = s1.split(" ");
 int n = Integer.parseInt(s2[0]);
 long m= Long.parseLong(s2[1]);
 Listt l = new Listt(n);
  int kk =0;
if(n>=3 && n<=10000000 && m>=1 && m<=200000){
 while( kk!= m){

	 String s3 = inn.nextLine();
	 
	 
	 int a=Integer.parseInt(s3.split(" ")[0]);
	int b =Integer.parseInt(s3.split(" ")[1]);
	 long c =Long.parseLong(s3.split(" ")[2]);
     if(a>=1 && b>=1 && a <= b && a<=n && b<= n && c>=0 && c<=1000000000){ 
	 l.add(a, b, c);
     }
	 kk++;
 }
 

long maxxx = l.max();
 
    System.out.println(maxxx);
    inn.close();
    }
       
    }
}