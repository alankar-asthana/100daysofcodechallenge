
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class DoubleLinkedList {
    static Node head;
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }
    public static void insertfirst(int item){
        Node newnode = new Node(item);
        if(head==null){
            head=newnode;
            return;
        }
        head.prev=newnode;
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
        newnode.prev=temp;
    }
    public static void deletefirst(){
        if(head==null)
            return;
        System.out.println("Deleted item is: "+head.data);
        if(head.next==null)
            head=null;
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public static void deletelast(){
        if(head==null)
            return;   
        Node temp=head;
        Node p=null;
        while(temp.next!=null){
            p=temp;
            temp=temp.next;
        }
        System.out.println("Deleted item is: "+temp.data);
        temp.prev=null;
        p.next=null;
    }
    public static void deleteitem(int item){
        if(head==null)
            return;
        if(head.data==item){
            head=head.next;
            head.prev=null;
            return;
        }
        Node temp=head;
        Node p=null;
        while(temp.data!=item){
            p=temp;
            temp=temp.next;
            if(temp.next==null){
                System.out.println("Element "+item+" is not in  the list");
                return;
            }
        }
        System.out.println("Deleted item is: "+temp.data);
        p.next=temp.next;
        p.next.prev=p;
        temp.prev=null;
        temp.next=null;
    }
    public void printlist(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }   
        System.out.println(temp.data);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DoubleLinkedList list=new DoubleLinkedList();
        list.insertfirst(60);
        list.insertfirst(20);
        list.insertlast(30);
        list.insertlast(40);
        list.insertfirst(70);
        list.insertlast(80);
        list.printlist();
        list.deletefirst();
        list.deletelast();
        list.deleteitem(30);
        list.printlist();
    }
}
