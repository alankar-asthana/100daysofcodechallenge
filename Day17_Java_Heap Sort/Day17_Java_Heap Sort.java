
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class HeapSort {
    public static void heapify(int arr[],int n,int i){
        int largest=i;
        int leftchild=2*i+1;
        int rightchild=2*i+2;
        if(leftchild<n&&arr[leftchild]>arr[largest])
            largest=leftchild;
        if(rightchild<n&&arr[rightchild]>arr[largest])
            largest=rightchild;
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
        }
    }
    
    public static void sort(int arr[],int n){
        for(int i=n/2-1;i>=0;i--)
            heapify(arr,n,i);
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
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
	sort(arr,arr.length);
        System.out.println("\nBelow is the sorted array");
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
        }
    }
}
