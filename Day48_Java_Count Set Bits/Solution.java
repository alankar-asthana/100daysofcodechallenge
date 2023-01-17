import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class SetBits {
    static void count1(int n){
        String bits=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<bits.length();i++){
            if(bits.charAt(i)=='1')
                count++;
        }
        System.out.println("Count of set bits with solution 1: "+count);
    }
    static void count2(int n){
        int count=0;
        while(n!=0){
            if((n&1)!=0)
                count++;
            n=n>>1;
        }
        System.out.println("Count of set bits with solution 2: "+count);
    }
    static void count3(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        System.out.println("Count of set bits with solution 3: "+count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        
        //Solution 1:
        count1(n);
        
        //Soluyion 2:
        count2(n);
        
        //Solution 3:
        count3(n);
    }
}
