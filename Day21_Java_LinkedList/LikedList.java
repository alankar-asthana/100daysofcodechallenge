import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class LinkedList {
    static Node head;
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void insertfirst(int item){
        Node newnode = new Node(item);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void insertlast(int item){
        Node newnode = new Node(item);
        if(head==null){
            head=newnode;
            return;
        }        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public static void insertafter(int item,int after){
        Node newnode = new Node(item);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.data!=after){
            temp=temp.next;
        }
        if(temp.next==null)
            temp.next=newnode;
        else{
            Node swap=temp.next;
            temp.next=newnode;
            newnode.next=swap;
        }
    }
    public static void insertbefore(int item,int before){
        Node newnode = new Node(item);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        Node p=null;
        while(temp.data!=before){
            p=temp;
            temp=temp.next;
        }
        
        if(p==null){
            newnode.next=head;
            head=newnode;
        }
        else{
            Node swap=p.next;
            p.next=newnode;
            newnode.next=swap;
        }
    }
    public void printlist(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }   
        System.out.print(temp.data+"->");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertlast(30);
        list.insertlast(40);
        list.insertbefore(50,30);
        list.insertbefore(60,20);
        list.insertafter(70,10);
        list.insertafter(80,40);
        list.printlist();
    }
}
