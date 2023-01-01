/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class ArrayQueue {
    static int max=1000;
    static int rear;
    static int [] array=new int[max];
    static int front=rear=-1;
    
    boolean isEmpty(){
        if(rear==-1||front>rear)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if(rear==max-1)
            return true;
        else
            return false;
    }
    
    public void enqueue(int item){
        if(isFull())
            System.out.println("Stack is overflow");
        else if(isEmpty()){
            array[++rear]=item;
            front=rear;
        }
        else
            array[++rear]=item;
    }
    public int dequeue(){
        int x=0;
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            x=array[front++];
            return x;
        }
    }
    public int peek(){
        int x=0;
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            x=array[front];
            return x;
        }        
    }
    void printqueue(){
        for(int i = front;i<=rear;i++){
          System.out.println("+"+ array[i]+"+");
        }
    }
    public static void main(String args[]){
        ArrayQueue Q1=new ArrayQueue();
        Q1.enqueue(10);
        Q1.enqueue(20);
        Q1.enqueue(30);
        Q1.enqueue(40);
        Q1.enqueue(50);
        
        System.out.println("Front Element before dequeue: "+Q1.peek());
        System.out.println("Below is the items in queue before dequeue");
        Q1.printqueue();
        System.out.println("Dequeued Element: "+Q1.dequeue());
        System.out.println("Front Element after dequeue: "+Q1.peek());
        System.out.println("Below is the items in queue after dequeue");
        Q1.printqueue();
        System.out.println("Rear element in queue: "+array[rear]);
    }
}
