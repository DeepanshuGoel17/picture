package hackerrank;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ValidTree {

  
    public static void main(String[] args) {
    List<Integer> listArr = new ArrayList<Integer>();
       try{
           Scanner in= new Scanner(System.in);
           int x= in.nextInt();
           for(int i =0;i<x;i++){
              int y = in.nextInt();
               int j=0;
               for(;j<y;j++){
                   
                   listArr.add(in.nextInt());
                   
               }
                if(checkTree(listArr))
            System.out.println("YES");
        else
            System.out.println("NO");
           }
       }catch (InputMismatchException inputMismatch)

       {
           System.out.println("Wrong Input Format");
       }
       
       in.close();
        
        
   
    }

    public static boolean checkTree(List<Integer> arr)
    {
        if(arr.size() == 1)
        {
            return true;
        }

        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        Integer root = arr.get(0);
        int idx = 1;

        //adding left subtree nodes
        while(arr.get(idx) < root)
        {
            left.add(arr.get(idx++));

            if(idx >= arr.size())
                break;
        }

        //adding right subtree nodes
        if(! (idx >= arr.size()))
            while(arr.get(idx) > root)
            {
                right.add(arr.get(idx++));

                if(idx >= arr.size())
                    break;
            }

        if(left.size() + right.size() == arr.size() - 1)
        {
            if(left.size()==0)
            {
                return true && checkTree(right);
            }
            else if(right.size() == 0)
            {
                return true && checkTree(left);
            }
            else
            {
                return checkTree(left) && checkTree(right);
            }
        }
        else
        {
            return false;
        }

    }

}

 
