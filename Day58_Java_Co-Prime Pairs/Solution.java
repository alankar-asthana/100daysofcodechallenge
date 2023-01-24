import java.util.*;
/*
 * @author Alankar Asthana
 */
public class CoPrime {
    static int GCD(int a, int b){
        if(a==0)
            return b;
        return GCD(b%a, a);
    }
    
    static boolean coprime(int a, int b){
        return (GCD(a,b)==1);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(coprime(i,n))
                System.out.println("CO-Prime Pairs : "+i+" "+n);
        }
    }
}
