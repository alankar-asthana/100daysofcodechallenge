/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class Stack {
    static Node head;
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    boolean isEmpty(){
        if(head==null)
            return true;
        return false;
    }
    public static void push(int item){
        Node newnode = new Node(item);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static int pop(){
        if(head==null)
            System.out.println("Stack is empty.");
        int popped=head.data;
        head=head.next;
        return popped;
    }
    public static int peek(){
        if(head==null)
            System.out.println("Stack is empty.");
        int peeked=head.data;
        return peeked;        
    }
    public void printstack(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println("+"+temp.data+"+");
            temp=temp.next;
        }   
        System.out.println("+"+temp.data+"+");
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        System.out.println("Top Element before pop: "+peek());
        System.out.println("Below is the items in stack before pop");
        st.printstack();
        System.out.println("Popped Element: "+pop());
        System.out.println("Top Element after pop: "+peek());
        System.out.println("Below is the items in stack after pop");
        st.printstack();
    }
}
