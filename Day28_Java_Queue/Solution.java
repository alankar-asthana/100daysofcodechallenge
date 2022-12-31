/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class Queue {
    static Node front,rear;
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    boolean isEmpty(){
        if(rear==null)
            return true;
        return false;
    }
    public static void enqueue(int item){
        Node newnode = new Node(item);
        if(front==null&&rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    public static int dequeue(){
        if(front==null&&rear==null){
            System.out.println("Stack is empty.");
            return 0;
        }
        else{
            int popped=front.data;
            front=front.next;
            return popped;
        }
    }
    public static int peek(){
        if(front==null&&rear==null){
            System.out.println("Stack is empty.");
            return 0;
        }
        else{
            int peeked=front.data;
            return peeked;
        }       
    }
    public static int rear(){
        if(front==null&&rear==null){
            System.out.println("Stack is empty.");
            return 0;
        }
        else{
            int peeked=rear.data;
            return peeked;
        } 
    }
    public void printqueue(){
        Node temp=front;
        while(temp.next!=null){
            System.out.println("+"+temp.data+"+");
            temp=temp.next;
        }   
        System.out.println("+"+temp.data+"+");
    }
    public static void main(String[] args){
        Queue Q=new Queue();
        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.enqueue(40);
        Q.enqueue(50);
        
        System.out.println("Front Element before dequeue: "+peek());
        System.out.println("Below is the items in queue before dequeue");
        Q.printqueue();
        System.out.println("Dequeued Element: "+dequeue());
        System.out.println("Front Element after dequeue: "+peek());
        System.out.println("Below is the items in queue after dequeue");
        Q.printqueue();
        System.out.println("Rear element in queue: "+rear());
    }
}
