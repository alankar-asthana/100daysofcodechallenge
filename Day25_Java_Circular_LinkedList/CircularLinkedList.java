/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class CircularLinkedList {
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
            newnode.next=head;
            return;
        }
        Node temp=head.next;
        while(temp.next!=head){
            temp=temp.next;
        }
        newnode.next=head;
        head=newnode;
        temp.next=newnode;
    }
    public static void insertlast(int item){
        Node newnode = new Node(item);
        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }
        Node temp=head.next;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }
//    public static void insertafter(int item,int after){
//        Node newnode = new Node(item);
//        if(head==null){
//            head=newnode;
//            newnode.next=head;
//            return;
//        }
//        Node temp=head;
//        while(temp.data!=after){
//            temp=temp.next;
//        }
//        if(temp.next==head){
//            temp.next=newnode;
//            newnode.next=head;
//        }
//        else{
//            Node swap=temp.next;
//            temp.next=newnode;
//            newnode.next=swap;
//        }
//    }
//    public static void insertbefore(int item,int before){
//        Node newnode = new Node(item);
//        if(head==null){
//            head=newnode;
//            newnode.next=head;
//            return;
//        }
//        Node temp=head;
//        Node p=null;
//        while(temp.data!=before){
//            p=temp;
//            temp=temp.next;
//        }
//
//        if(p==null&&head.next==head){
//            newnode.next=head;
//            head.next=newnode;
//            head=newnode;
//            return;
//        }
//        Node temp1=head.next;
//        while(temp.next!=head){
//            temp=temp.next;
//        }
//        if(p==null&&head.next!=head){
//            newnode.next=head;
//            head=newnode;
//            temp1.next=head;
//            return;
//        }
//        else{
//            Node swap=p.next;
//            p.next=newnode;
//            newnode.next=swap;
//        }
//    }
//    public static void deletefirst(){
//        if(head==null)
//            return;
//        if(head.next==head){
//            head=null;
//            return;
//        }
//            Node temp=head.next;
//            while(temp.next!=head){
//            temp=temp.next;
//            }
//            head=head.next;
//            temp.next=head;
//    }
//    
//    public static void deletelast(){
//        if(head==null)
//            return;    
//        if(head.next==head){
//            head=null;
//            return;
//        }
//        Node temp=head.next;
//        Node p=null;
//        while(temp.next!=head){
//            p=temp;
//            temp=temp.next;
//        }
//        p.next=head;
//    }
//    public static void deleteitem(int item){
//        if(head==null)
//            return;
//        if(head.data==item&&head.next==head){
//            head=null;
//            return;
//        }
//        Node temp=head;
//        Node p=null;
//        while(temp.data!=item){
//            p=temp;
//            temp=temp.next;
//            if(temp.next==head){
//                System.out.println("Element "+item+" is not in  the list");
//                return;
//            }
//        }
//        p.next=temp.next;
//    }
//    public static void reverseiterative(){
//        if(head==null||head.next==null)
//            return;
//        
//        Node nextnode=head.next;
//        Node currnode=head;
//        while(nextnode.next!=null){
//            Node temp=nextnode.next;
//            nextnode.next=currnode;
//            currnode=nextnode;
//            nextnode=temp;
//        }
//        nextnode.next=currnode;
//        head.next=null;
//        head=nextnode;
//    }
//    public static Node reverserecursive(Node head){
//        if(head == null||head.next == null) {
//            return head;
//        }
//        Node previous = head;
//        Node newnode=reverserecursive(head.next);
//        head.next.next= previous;
//        head.next=null;
// 
//        return newnode;
//    }
    public void printlist(){
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }   
        System.out.println(temp.data+"->");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CircularLinkedList list=new CircularLinkedList();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertlast(30);
        list.insertlast(40);
//        list.insertbefore(50,30);
//        list.insertbefore(60,20);
//        list.insertafter(70,10);
//        list.insertafter(80,40);
        list.printlist();
//        list.deletefirst();
//        list.deletelast();
//        list.printlist();
//        list.deleteitem(20);
//        list.printlist();
//        list.deleteitem(60);
//        list.printlist();
//        list.reverseiterative();
//        System.out.println("Reversed linked list with iterative method");
//        list.printlist();
//        list.head=list.reverserecursive(list.head);
//        System.out.println("Reversed linked list with recursive method");
//        list.printlist();
    }
}
