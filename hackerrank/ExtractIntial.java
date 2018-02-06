package hackerrank;

public class ExtractIntial {

	public static String extract(String s1){
		String ans="";
	char ch[] = s1.toCharArray();
		for(char i: ch){
			
			if(Character.isUpperCase(i)){
				
				ans =ans+i;
			}	
		}
		return ans;
	}
	public static void main(String args[]){
		String s = "KaviArasuV";
		String s2= extract(s);
		System.out.println(s2);
		
		
		
	}
	
	
	
}
