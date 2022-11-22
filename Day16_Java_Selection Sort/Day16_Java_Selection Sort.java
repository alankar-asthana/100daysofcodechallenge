import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class SelectionSort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                   min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array");
        int n=sc.nextInt();
	int arr[]=new int[n];
        System.out.println("Enter "+n+" values in array");
	for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Below is the unsorted array");
        for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
        }
	sort(arr);
        System.out.println("\nBelow is the sorted array");
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
        }
    }
}
