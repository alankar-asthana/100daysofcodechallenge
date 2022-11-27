# What is Linked List
```
Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous location.
The elements are linked using pointers. They include a series of connected nodes. Here, each node stores the data and the address 
of the next node.
```
```
![image](https://user-images.githubusercontent.com/61406986/204149911-96360a28-4164-4bfe-aab9-5f9d22ca2b5c.png)
```
## Why Linked List? 

Arrays can be used to store linear data of similar types, but arrays have the following limitations:
```
The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, 
the allocated memory is equal to the upper limit irrespective of the usage. 
Insertion of a new element / Deletion of a existing element in an array of elements is expensive: The room has to be 
created for the new elements and to create room existing elements have to be shifted but in Linked list if we have the 
head node then we can traverse to any node through it and insert new node at the required position.

Example: 
In a system, if we maintain a sorted list of IDs in an array id[] = [1000, 1010, 1050, 2000, 2040]. 
If we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 1000 (excluding 1000). 

Deletion is also expensive with arrays until unless some special techniques are used. For example, to delete 1010 in id[],
everything after 1010 has to be moved due to this so much work is being done which affects the efficiency of the code.
```

## Advantages of Linked Lists over arrays:

1. Dynamic Array.
2. Ease of Insertion/Deletion.
3. Drawbacks of Linked Lists: 
4. Random access is not allowed. We have to access elements sequentially starting from the first node(head node).
   So we cannot do a binary search with linked lists efficiently with its default implementation. 
5. Extra memory space for a pointer is required with each element of the list. 
6. Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.

## Types of Linked Lists:
```
1. Simple Linked List – In this type of linked list, one can move or traverse the linked list in only one direction
2. Doubly Linked List – In this type of linked list, one can move or traverse the linked list in both directions (Forward and Backward)
3. Circular Linked List – In this type of linked list, the last node of the linked list contains the link of the first/head node of the 
linked list in its next pointer and the first/head node contains the link of the last node of the linked list in its prev pointer
```
## Basic operations on Linked Lists:
1. Deletion
2. Insertion
3. Search
4. Display

## Representation of Linked Lists: 
A linked list is represented by a pointer to the first node of the linked list. The first node is called the head of the linked list. 
If the linked list is empty, then the value of the head points to NULL. 

Each node in a list consists of at least two parts: 

A Data Item (we can store integer, strings, or any type of data).
Pointer (Or Reference) to the next node (connects one node to another) or An address of another node

## Time Complexity:
```
Operations/Time Complexity	Worst Case	Average Case
Search	                          O(n)	         O(n)
Insert	                          O(1)	         O(1)
Deletion	                  O(1)	         O(1)

Auxiliary Space: O(N)
```
