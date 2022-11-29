# Introduction and Insertion in a Doubly Linked List

A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.

Prerequisites: Linked List Introduction, Inserting a node in Singly Linked List
```
```
## Advantages of DLL over the singly linked list:
1.A DLL can be traversed in both forward and backward directions. 
2.The delete operation in DLL is more efficient if a pointer to the node to be deleted is given. 
3.We can quickly insert a new node before a given node. 
4.In a singly linked list, to delete a node, a pointer to the previous node is needed. To get this previous node, sometimes the list is traversed. In DLL, we can get the previous node using the previous pointer. 
## Disadvantages of DLL over the singly linked list:
1.Every node of DLL Requires extra space for a previous pointer. It is possible to implement DLL with a single pointer though (See this and this). 
2.All operations require an extra pointer previous to be maintained. For example, in insertion, we need to modify previous pointers together with the next pointers. For example in the following functions for insertions at different positions, we need 1 or 2 extra steps to set the previous pointer.
## Insertion in DLL:
A node can be added in four ways:

1.At the front of the DLL 
2.After a given node. 
3.At the end of the DLL 
4.Before a given node.

## 1) Add a node at the front:
The new node is always added before the head of the given Linked List. And newly added<br> node becomes the new head of DLL. For example, if the given Linked List is <br>1->0->1->5 and we add an item 5 at the front, then the Linked List becomes 5->1->0->1->5. <br>Let us call the function that adds at the front of the list push(). <br>The push() must receive a pointer to the head pointer because the push must change the head pointer to point to the new node (See this)
```
![image](https://user-images.githubusercontent.com/61406986/204611855-a9e22a1c-38ed-4eb8-bc12-26c837374029.png)
```

Time Complexity: O(n)<br>
Auxiliary Space: O(1)
## 2) Add a node after a given node:
We are given a pointer to a node as prev_node, and the new node is inserted after the given node.
```
![image](https://user-images.githubusercontent.com/61406986/204611980-5a685b81-8b8a-45c9-bdf6-66de830a461a.png)
```
Time Complexity: O(1)<br>
Auxiliary Space: O(1)
## 3) Add a node at the end:
The new node is always added after the last node of the given Linked List. For example,<br> if the given DLL is 5->1->0->1->5->2 and we add item 30 at the end, then the DLL becomes <br>5->1->0->1->5->2->30. Since a Linked List is typically represented by its head of it, we have to traverse the list till the end and then change the next of last node to the new node.
```
![image](https://user-images.githubusercontent.com/61406986/204612218-54a71bbe-9578-4aff-b576-81bf64d43482.png)
```
Time Complexity: O(n)<br>
Auxiliary Space: O(1)
## 4) Add a node before a given node: 
Follow the below steps to solve the problem:

Let the pointer to this given node be next_node and the data of the new node be added as new_data. 

1.Check if the next_node is NULL or not. If it’s NULL, return from the function because any new node can not be added before a NULL
2.Allocate memory for the new node, let it be called new_node
3.Set new_node->data = new_data
4.Set the previous pointer of this new_node as the previous node of the next_node, new_node->prev = next_node->prev
5.Set the previous pointer of the next_node as the new_node, next_node->prev = new_node
6.Set the next pointer of this new_node as the next_node, new_node->next = next_node;
7.If the previous node of the new_node is not NULL, then set the next pointer of this previous node as new_node, new_node->prev->next = new_node
8.Else, if the prev of new_node is NULL, it will be the new head node. So, make (*head_ref) = new_node.
```
![image](https://user-images.githubusercontent.com/61406986/204612440-1c1aa183-46e7-4a92-b6d9-b84504795108.png)
```
Time Complexity: O(n)<br>
Auxiliary Space: O(1)
