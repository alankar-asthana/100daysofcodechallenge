
import java.util.*;
/*
 * @author Alankar Asthana
 */
public class Binary {
    static void Binary(int n){
        if(n==0)
            return;
        Binary(n/2);
        System.out.print((n%2)+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Binary(n);
    }
}
