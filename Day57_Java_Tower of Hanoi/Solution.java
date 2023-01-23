import java.util.*;
/**
 *
 * @author Alankar Asthana
 */
public class TowerOfHanoi {
    static void TOH(int n, char A, char B,char C){
        if(n==1){
            System.out.println("Move "+n+" from "+A+" to "+C);
            return;
        }
        TOH(n-1, A, C, B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        TOH(n-1, B, A, C);       
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TOH(n,'A','B','C');
    }
}
