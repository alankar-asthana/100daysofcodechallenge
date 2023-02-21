import java.util.*;
/*
 * @author Alankar Asthana
 */
public class BinaryPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        if(n%2==0)
            System.out.println(n+" is not a `Binary Palindrome` number.");
        else{
            while(temp>0){
                rev=rev<<1;
                if((temp&1)==1)
                    rev=rev^1;
                temp=temp>>1;
            }
            System.out.println(rev);
            if(rev==n)
                System.out.println(n+" is a `Binary Palindrome` number.");
            else
                System.out.println(n+" is not a `Binary Palindrome` number.");
        }
    }
}
