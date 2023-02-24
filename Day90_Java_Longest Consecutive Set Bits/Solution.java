import java.util.*;
/*
 * @author Alankar Asthana
 */
public class SequenceOfSetBits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int prev=0,curr=0,max=0;
        
        while(n>0){
            if((n&1)==1)
                curr++;
            else if((n&1)==0){
                int temp=n>>1;
                if((temp&1)==1){//Or n&2==2
                    prev=curr;
                    curr=0;
                }
            }
            max=Math.max((prev+curr), max);
            n=n>>1;
        }
        System.out.println("Maximum Sequence of set bits is: "+(max+1));
    }
}
