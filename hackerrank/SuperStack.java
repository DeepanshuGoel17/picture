package hackerrank;

public class SuperStack {
	
	public static int[] push(int a, int t, int[] arr){
		t =t+1;
		arr[t] =a;
		System.out.println(arr[t]);
		return arr;
				
	}
	public static int pop(int t,int[] arr){
		if(t==0){
			System.out.println("Empty");
		t=t-1;
		}
		else{
			
			t=t-1;
			System.out.println(arr[t]);
			
		}
		
return t;
		
	}
	public static int[] inc(int a,int b,int t,int[] arr){
		
		for (int i =0;i<a;i++){
			arr[i] =arr[i]+b;
			
			
		}
		
		
		
		
		return arr;
	}
	
	   static void superStack(String[] operations) {
		   int[] stck = new int[200000];
		   int top= -1;
for(int i=0; i < operations.length;i++){
	String s1 = operations[i];
	if(s1.charAt(2) == 's'){
	String [] s2	=new String[2];
	s2=s1.split(" "); 
	int x= Integer.parseInt(s2[1]);
	stck =	push(x,top,stck);
	top++;
		
	}
	else if(s1.charAt(2)== 'p'){
		if(top<0){
			System.out.println("Empty");
			
		}
		else{
	top= 	pop(top,stck);
	
	}
	}
	else{
		
		String s2[] = new String[3];
		s2=s1.split(" ");
		int x= Integer.parseInt(s2[1]);
		int y = Integer.parseInt(s2[2]);
	 stck =	inc(x,y,top,stck);
	 System.out.println(stck[top]);
		
	}
	
	
}
		   
		   
		   
		   
		   
		   
		   
	    }
public static void main(String args[]){
	String [] s ={"push 4","pop","push 3","push 5","push 2","inc 3 1","pop","push 1", "inc 2 2","push 4","pop","pop"};
	superStack(s);	
}

}
