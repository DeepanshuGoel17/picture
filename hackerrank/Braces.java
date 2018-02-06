package hackerrank;

import java.util.Stack;

public class Braces {
	static String[] braces(String[] values) {
 String [] ans = new String[values.length];
 for (int i=0;i<values.length;i++){
	 Stack<Character> stck = new Stack<Character>(); 
	 while(!stck.empty()){
		 stck.pop();
		 
	 }
	 for(int j =0; j<values[i].length();j++){
		 if(values[i].charAt(j)=='(' || values[i].charAt(j)=='{' || values[i].charAt(j)=='[' ){
			 stck.push(values[i].charAt(j));
			
		 }
		 else{
			 if(!stck.empty()){
			 char ch = stck.peek();
			 if(values[i].charAt(j)==')')
			 { 
				 if(ch == '{' || ch =='['){
					 ans[i] ="NO";
					 break;
				 }
				 stck.pop();
				 
				 
			 }
			 else if(values[i].charAt(j)=='}')
			 {
				 if(ch == '(' || ch =='['){
					 ans[i] ="NO";
					 break;
				 }
				 stck.pop();
				 
				 
			 }
			 else if(values[i].charAt(j)==']')
			 {
				 if(ch == '{' || ch =='('){
					 ans[i] ="NO";
					 break;
				 }
				 stck.pop();
	 
			 }
		 }
			 else{
				 ans[i] ="NO";
				 break;
			 }
			 }		 
	 }
	 if(stck.empty()){
		 ans[i]="YES";
	 }
	 
 }
 return ans;
 }
	public static void main(String args[]){
		String[] brac ={"{}[]()","{(})"};
		String[] an = braces(brac);
		for(String i: an){
			System.out.println(i);
		}
	}
}
