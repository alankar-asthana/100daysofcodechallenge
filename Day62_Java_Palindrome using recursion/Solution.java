import java.util.*;
/*
 * @author Alankar Asthana
 */
public class Palindrome {
    static boolean isPalindrome(String str, int start, int end){
        if(start>=end)
            return true;
        return(str.charAt(start)==str.charAt(end))&&isPalindrome(str,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the String");
        String str=sc.nextLine();
        
        int start=0;
        int end=str.length()-1;

        if(end<0){
            System.out.println("Please enter the string");
        }
        else{
            boolean result=isPalindrome(str,start,end);
            if(result==true)
                System.out.println("String is Palindrome String");
            else
                System.out.println("String is not a Palindrome String");
        }
    }
}
