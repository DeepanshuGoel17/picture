package hackerrank;


iimport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {
    /*
     * Complete the function below.
     */
    static int maxXor(int left, int right, int k) {
       Vector<Integer> v= new Vector();
        int max=0;
     
        for(int i=left;i<right;i++){
            
            for(int j = i+1; j<=right;j++){
                
               v.add(i^j);
                     
            }     
            int d=v.size();
          //v.copyInto(int x [d]);
       
            Integer [] x= v.toArray(new Integer[d]);
      
            for(int j=0;j<d;j++){
                if(max < x[j] && max<=k){
                    max = x[j];
                    
                }
                
                
                
                
            }
          
            
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int left;
        left = Integer.parseInt(in.nextLine().trim());

        int right;
        right = Integer.parseInt(in.nextLine().trim());

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = maxXor(left, right, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
