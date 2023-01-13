import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class PrimePairs {
    static boolean prime(int a){
        if(a==2||a==3)
            return true;
        int flag=0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0)
                flag=1;
        }
        if(flag==1)
            return false;
        else
            return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int dif=sc.nextInt();
        int flag=0;
        for(int i=n;i<=m;i++){
            if(i+6<=m){
                if(prime(i)&&prime(i+dif)){
                    System.out.print("("+i+","+(i+dif)+") ");
                    flag=1;
                }
           }
        }
        if(flag==0)
            System.out.println("No Prime Pairs");
    }
}
