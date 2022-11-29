
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
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertlast(30);
        list.insertlast(40);
        list.insertfirst(30);
        list.insertlast(20);
        list.printlist();
    }
}
