/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class ArrayStack {
    static int max=1000;
    int [] array=new int[max];
    static int top=-1;
    
    boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if(top==max-1)
            return true;
        else
            return false;
    }
    
    public void push(int item){
        if(isFull())
            System.out.println("Stack is overflow");
        else
            array[++top]=item;
    }
    public int pop(){
        int x=0;
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            x=array[top--];
            return x;
        }
    }
    public int peek(){
        int x=0;
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            x=array[top];
            return x;
        }        
    }
    void print(){
        for(int i = top;i>-1;i--){
          System.out.println("+"+ array[i]+"+");
        }
    }
    public static void main(String args[])
    {
        ArrayStack S = new ArrayStack();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);
        System.out.println("Top element is: "+ S.peek());
        System.out.println("Elements present in stack: ");
        S.print();
        System.out.println("Popped element is: "+S.pop());
        System.out.println("Top element is: "+ S.peek());
        System.out.println("Elements present in stack: ");
        S.print();
    }
}
