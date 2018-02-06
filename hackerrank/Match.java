package hackerrank;

public class Match {
	public static int match(String a,String b){
		int ans=0;
		int i=0;
		int j=0;
		while(i<a.length() && j<b.length())
		{
            String a1=String.valueOf(a.charAt(i));
            String a2=String.valueOf(b.charAt(j));
			if(a1.equalsIgnoreCase(a2)){
				System.out.println("A::;"+a1+"B:::::"+a2);
				ans++;
				i++;
				j++;
				System.out.println("I:"+i+"::J::"+j);
			}
			else{
				ans=0;
			i++;
			}
			
		}
		return ans;
	}
	public static void main(String args[]){
		
		int x =match("Deeanshu","anshu");
		System.out.println("Ans:"+x);
		
		
	}
}
