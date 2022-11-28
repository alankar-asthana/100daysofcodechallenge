# Reverse a Linked List

Given a pointer to the head node of a linked list, the task is to reverse the linked list. We need to reverse the list by changing the links between nodes.

Examples: 
```
Input: Head of following linked list 
1->2->3->4->NULL 
Output: Linked list should be changed to, 
4->3->2->1->NULL

Input: Head of following linked list 
1->2->3->4->5->NULL 
Output: Linked list should be changed to, 
5->4->3->2->1->NULL

Input: NULL 
Output: NULL

Input: 1->NULL 
Output: 1->NULL 
```
## Reverse a linked list by Iterative Method:
The idea is to use three pointers curr, prev, and next to keep track of nodes to update reverse links.

Illustration:
```
Follow the steps below to solve the problem:

Initialize three pointers prev as NULL, curr as head, and next as NULL.
Iterate through the linked list. In a loop, do the following:
Before changing the next of curr, store the next node 
next = curr -> next
Now update the next pointer of curr to the prev 
curr -> next = prev 
Update prev as curr and curr as next 
prev = curr 
curr = next
```
Time Complexity: O(N), Traversing over the linked list of size N.<br>
Auxiliary Space: O(1)

## Reverse a linked list using Recursion:
The idea is to reach the last node of the linked list using recursion then start reversing the linked list.

Illustration:
```
Follow the steps below to solve the problem:

Divide the list in two parts – first node and rest of the linked list.
Call reverse for the rest of the linked list.
Link the rest linked list to first.
Fix head pointer to NULL
```
Time Complexity: O(N), Visiting over every node one time <br>
Auxiliary Space: O(N), Function call stack space
