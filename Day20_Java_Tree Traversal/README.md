# Tree Traversals (Inorder, Preorder and Postorder)

Unlike linear data structures (Array, Linked List, Queues, Stacks, etc) which have only one logical way to traverse them, trees can be traversed in different ways.<br>
The following are the generally used methods for traversing trees:

Example:
```
![image](https://user-images.githubusercontent.com/61406986/204102323-c73b1898-f4e5-4b8d-9fed-3eb501fc797f.png)
```

## Inorder Traversal (Practice): 
```
### Algorithm Inorder(tree)


Traverse the left subtree, i.e., call Inorder(left->subtree)
Visit the root.
Traverse the right subtree, i.e., call Inorder(right->subtree)
Uses of Inorder Traversal:
In the case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order. To get nodes of BST in <br>
non-increasing order, a variation of Inorder traversal where Inorder traversal is reversed can be used. 
Example: In order traversal for the above-given figure is 4 2 5 1 3.
```
Time Complexity: O(N)<br>
Auxiliary Space: If we don’t consider the size of the stack for function calls then O(1) otherwise O(h) where h is the height of the tree. 

## Preorder Traversal (Practice): 
```
### Algorithm Preorder(tree)

Visit the root.
Traverse the left subtree, i.e., call Preorder(left->subtree)
Traverse the right subtree, i.e., call Preorder(right->subtree) 
Uses of Preorder:
Preorder traversal is used to create a copy of the tree. Preorder traversal is also used to get prefix expressions on an expression tree.
Example: Preorder traversal for the above-given figure is 1 2 4 5 3.
```
Time Complexity: O(N)<br>
Auxiliary Space: If we don’t consider the size of the stack for function calls then O(1) otherwise O(h) where h is the height of the tree. 

## Postorder Traversal (Practice): 
```
### Algorithm Postorder(tree)

Traverse the left subtree, i.e., call Postorder(left->subtree)
Traverse the right subtree, i.e., call Postorder(right->subtree)
Visit the root
Uses of Postorder:
Postorder traversal is used to delete the tree. Please see the question for the deletion of a tree for details.<br> Postorder traversal is also useful to get the postfix expression of an expression tree
Example: Postorder traversal for the above-given figure is 4 5 2 3 1
```
Time Complexity: O(N)<br>
Auxiliary Space: If we don’t consider the size of the stack for function calls then O(1) otherwise O(h) where h is the height of the tree. 

Note: The height of the skewed tree is n (no. of elements) so the worst space complexity is O(N) and the height is (Log N) for the balanced tree so the best space
complexity is O(Log N).

Let us see different corner cases:

Complexity function T(n) — for all problems where tree traversal is involved — can be defined as: T(n) = T(k) + T(n – k – 1) + c
Where k is the number of nodes on one side of the root and n-k-1 on the other side.

Let’s do an analysis of boundary conditions:
