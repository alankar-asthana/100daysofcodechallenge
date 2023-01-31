import java.util.*;
/*
 * @author Alankar Asthana
 */
public class WordSubset {
    static void subset(String str, String curr, int i){
        if(i==str.length()){
            System.out.print(curr+"  ");
            return;
        }
        subset(str,curr,i+1);
        subset(str,curr+str.charAt(i),i+1);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str=sc.nextLine();
        
        System.out.println("Following are the subsets of string");
        
        subset(str,"",0);
    } 
}
