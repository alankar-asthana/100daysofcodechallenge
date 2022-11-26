import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alankar Asthana
 */
public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryT{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
    }
    
    public static void preorder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void levelorder(Node root){
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }
    }
    public static void main(String[] args){
        int nodes[]={120,220,401,-1,-1,405,-1,-1,130,-1,706,-1,-1};//Array is in preorder format
        BinaryT pre=new BinaryT();
        Node root=pre.buildtree(nodes);
        System.out.println("Root: "+root.data);
        System.out.println("Preorder");
        preorder(root);
        System.out.println("\nPostorder");
        postorder(root);
        System.out.println("\nInorder");
        inorder(root);
        System.out.println("\nLevel order");
        levelorder(root);
    }
}
