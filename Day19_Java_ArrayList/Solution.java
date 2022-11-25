import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter size of array list");
        int n=sc.nextInt();
        //System.out.println("Enter "+n+" elements in array list");
        ArrayList<Integer> arr= new ArrayList();
        for(int j=0;j<n;j++) {
            int i = sc.nextInt();
            arr.add(i);
        }
        //System.out.println("Enter the number of queries");
        int query=sc.nextInt();
        for(int i=0;i<query;i++){
            //System.out.println("Enter query as insert or delete");
            String input=sc.next();
            if(input.equalsIgnoreCase("Insert")){
                //System.out.println("Enter index where to insert");
                int a=sc.nextInt();
                //System.out.println("Enter element to be inserted");
                int b=sc.nextInt();
                arr.add(a,b);
            }
            else if(input.equalsIgnoreCase("Delete")){
                //System.out.println("Enter index where to delete");
                arr.remove(sc.nextInt());
            }
        }
        for(Integer a:arr)
            System.out.print(a+" ");
    }
} 
