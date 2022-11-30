
# Delete a node in a Doubly Linked List

```
[image](https://user-images.githubusercontent.com/61406986/204870427-dd0f690c-0df7-45e9-a7b0-0e4b7b0e139b.png)
```
```
Example:

Input: DLL = 2->45->3->1, Node = 45
Output:  2->3->1

Input: DLL = 2->45->3->1, Node = 1
Output:  2->45->3
```
## Recommended Practice

```
Approach: The deletion of a node in a doubly-linked list can be divided into three main categories: 

After the deletion of the head node. 
[image](https://user-images.githubusercontent.com/61406986/204871121-50b1eba3-602f-444c-ae9a-2797cb729cda.png)

After the deletion of the middle node. 
[image](https://user-images.githubusercontent.com/61406986/204871190-776e1dc9-c656-4a44-a569-85f6ab808a3d.png)

After the deletion of the last node.
[image](https://user-images.githubusercontent.com/61406986/204871245-ab7db0bf-777e-48d8-8b63-daba566d56e2.png)

All three mentioned cases can be handled in two steps if the pointer of the node to be deleted and the head pointer is known. 
```

1.If the node to be deleted is the head node then make the next node as head.
2.If a node is deleted, connect the next and previous node of the deleted node.
[image](https://user-images.githubusercontent.com/61406986/204871342-ffe05a53-e77f-4f9f-9ba2-366feaa43741.png)

Algorithm:

->Let the node to be deleted be del.<br>
->If node to be deleted is head node, then change the head pointer to next current head.
```
if headnode == del then
      headnode =  del.nextNode
```
->Set prev of next to del, if next to del exists.

```
if del.nextNode != none 
      del.nextNode.previousNode = del.previousNode 
```
->Set next of previous to del, if previous to del exists.
```
if del.previousNode != none 
      del.previousNode.nextNode = del.next
```
 
Time Complexity: O(1). <br>
Since traversal of the linked list is not required so the time complexity is constant.<br>
Auxiliary Space: O(1). <br>
As no extra space is required, so the space complexity is constant.
