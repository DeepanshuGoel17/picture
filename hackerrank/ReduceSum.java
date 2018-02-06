package hackerrank;

public class ReduceSum {
	 public static int lcm(int i, int y) {
		 int n;
		 int x, s = 1, t = 1;
		 n = 0;
	        x = 0;
	        s = 1;
	        t = 1;


	        for ( n = 1;; n++) {
	            s = i * n;
	            for (x = 1; t < s; x++) {
	                t = y * x;
	            }
	            if (s == t)
	                break;
	        }
	        return (s);
	    }

	
	 static String[] reducedFractionSums(String[] expressions) {
		 String [] s2  =  new String[expressions.length];

		for(int i= 0; i<expressions.length; i++){
			
			String[] s1 = new String[3];
			s1 =expressions[i].split("/+");

			int a = Integer.parseInt(s1[0]);
			
			int b=Integer.parseInt(s1[1].split("\\+")[0]);
		
			int c= Integer.parseInt(s1[1].split("\\+")[1]);
			int d =Integer.parseInt(s1[2]);
			System.out.println(a+"   "+ b+"     "+c+"   " +d);
			
			int dum = lcm(b,d);
			int num =((dum/b)*a)+((dum/d)*c);
			for(int j = 2;j<num ;j++){
				int x =num%j;
				int y =dum%j;
				System.out.println(y +" :AT::" +x);
				if(x== 0 && y == 0){
					System.out.println(num +" ::inside:" +dum);
					num = num/j;
					dum = dum/j;
					
				}
				System.out.println(num +" :out::"+j+"   :::" +dum);
				
				
			}
			s2[i] = num+"/"+dum;
		}
		 return s2;
		 
	    }
public static void main(String args[]){
	
	String[] s1 ={"1/2+1/6"};
	String []s2 =new String[s1.length];
	s2=reducedFractionSums(s1);
	System.out.println(s2[0]);
	
}

}
