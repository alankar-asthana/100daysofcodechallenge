

# Introduction to Circular Linked List

 
## What is Circular linked list?
The circular linked list is a linked list where all nodes are connected to form a circle. In a circular linked list, the first node and the last node are connected to each other which forms a circle. There is no NULL at the end.


### There are generally two types of circular linked lists:

1.Circular singly linked list: In a circular Singly linked list, the last node of the list contains a pointer to the first node of the list. We traverse the circular singly linked list until we reach the same node where we started. The circular singly linked list has no beginning or end. No null value is present in the next part of any of the nodes.

Representation of Circular singly linked list
```
![image](https://user-images.githubusercontent.com/61406986/205124859-f3080566-4b04-4c40-a876-df7f0fbaed09.png)
```

2. Circular Doubly linked list: Circular Doubly Linked List has properties of both doubly linked list and circular linked list in which two consecutive elements are linked or connected by the previous and next pointer and the last node points to the first node by the next pointer and also the first node points to the last node by the previous pointer.

Representation of circular doubly linked list
```
![image](https://user-images.githubusercontent.com/61406986/205124952-116dd26f-1d84-47a2-a0e1-3530dcc8afcc.png)
```

Note: We will be using the singly circular linked list to represent the working of the circular linked list.

Representation of circular linked list:
Circular linked lists are similar to single Linked Lists with the exception of connecting the last node to the first node.

Node representation of a Circular Linked List:

Time complexity: O(1) to insert a node at the beginning no need to traverse list it takes constant time 
Auxiliary Space: O(1)

2) Insertion at the end of the list: To insert a node at the end of the list, follow these steps: 

Create a node, say T. 
Make T -> next = last -> next; 
last -> next = T. 
last = T. 
```
![image](https://user-images.githubusercontent.com/61406986/205125051-266d9364-2ce7-4812-bc11-9ec41614fcdc.png)
![image](https://user-images.githubusercontent.com/61406986/205125084-5e156b1e-2a51-4798-bbfa-aa6c16e8cc14.png)
```
Before insertion,
![image](https://user-images.githubusercontent.com/61406986/205125146-3caee1fa-88d8-4fdb-8edb-6ea53d164334.png)

Circular linked list before insertion of node at the end

After insertion,
![image](https://user-images.githubusercontent.com/61406986/205125184-05f44f16-9c5a-421c-b3e9-7c34d8d2ac18.png)

Circular linked list after insertion of node at the end


Time Complexity: O(N)<br>
Auxiliary Space: O(1)

## 2. Deletion in a circular linked list:
1) Delete the node only if it is the only node in the circular linked list:

Free the node’s memory
The last value should be NULL A node always points to another node, so NULL assignment is not necessary.
Any node can be set as the starting point.
Nodes are traversed quickly from the first to the last.
2) Deletion of the last node:

Locate the node before the last node (let it be temp)
Keep the address of the node next to the last node in temp
Delete the last memory
Put temp at the end
3) Delete any node from the circular linked list: We will be given a node and our task is to delete that node from the circular linked list.

## Algorithm:
### Case 1: List is empty. 
```
If the list is empty we will simply return.
```
### Case 2:List is not empty  
```
If the list is not empty then we define two pointers curr and prev and initialize the pointer curr with the head node.
Traverse the list using curr to find the node to be deleted and before moving to curr to the next node, every time set prev = curr.
If the node is found, check if it is the only node in the list. If yes, set head = NULL and free(curr).
If the list has more than one node, check if it is the first node of the list. Condition to check this( curr == head). If yes, then move prev until it reaches the last node. After prev reaches the last node, set head = head -> next and prev -> next = head. Delete curr.
If curr is not the first node, we check if it is the last node in the list. Condition to check this is (curr -> next == head).
If curr is the last node. Set prev -> next = head and delete the node curr by free(curr).
If the node to be deleted is neither the first node nor the last node, then set prev -> next = curr -> next and delete curr.
```

Time Complexity: O(N), Worst case occurs when the element to be deleted is the last element and we need to move through the whole list.<br>
Auxiliary Space: O(1), As constant extra space is used.

## Advantages of Circular Linked Lists: 
```
Any node can be a starting point. We can traverse the whole list by starting from any point. We just need to stop when the first visited node is visited again. 
Useful for implementation of a queue. Unlike this implementation, we don’t need to maintain two pointers for front and rear if we use a circular linked list. We can maintain a pointer to the last inserted node and the front can always be obtained as next of last.
Circular lists are useful in applications to repeatedly go around the list. For example, when multiple applications are running on a PC, it is common for the operating system to put the running applications on a list and then cycle through them, giving each of them a slice of time to execute, and then making them wait while the CPU is given to another application. It is convenient for the operating system to use a circular list so that when it reaches the end of the list it can cycle around to the front of the list. 
Circular Doubly Linked Lists are used for the implementation of advanced data structures like the Fibonacci Heap.
```
## Disadvantages of circular linked list:
```
Compared to singly linked lists, circular lists are more complex.
Reversing a circular list is more complicated than singly or doubly reversing a circular list.
It is possible for the code to go into an infinite loop if it is not handled carefully.
It is harder to find the end of the list and control the loop.
```
## Applications of circular linked lists:
Multiplayer games use this to give each player a chance to play.<br>
A circular linked list can be used to organize multiple running applications on an operating system. These applications are iterated over by the OS.
## Why circular linked list?
A node always points to another node, so NULL assignment is not necessary.<br>
Any node can be set as the starting point.<br>
Nodes are traversed quickly from the first to the last.<br>
