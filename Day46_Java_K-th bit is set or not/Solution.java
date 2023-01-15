import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class BitOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int x=1;
        
        //Solution 1:
        for(int i=0;i<k-1;i++){
            x=x*2;
        }
        
        if((n&x)!=0)
            System.out.println("Bit is set");
        else
            System.out.println("Bit is not set");
        
        //Solution 2:
        x=1; int temp=n;
        for(int i=0;i<k-1;i++){
            temp=temp/2;
        }
        
        if((temp&x)!=0)
            System.out.println("Bit is set");
        else
            System.out.println("Bit is not set");
        
        //Solution 3:

        x=1<<(k-1);
        
        if((n&x)!=0)
            System.out.println("Bit is set");
        else
            System.out.println("Bit is not set");
        
        //Solution 4:
        
        x=n>>(k-1);
        
        if((x&1)!=0)
            System.out.println("Bit is set");
        else
            System.out.println("Bit is not set");
    }
}
