# Deletion in Linked List

We have discussed Linked List Introduction and Linked List Insertion in previous posts on a singly linked list.
Let us formulate the problem statement to understand the deletion process. 

## Delete from a Linked List:-
```
You can delete an element in a list from:

Beginning
End
Middle
```

1) Delete from Beginning:
```
Point head to the next node i.e. second node
    temp = head
    head = head->next
    
Make sure to free unused memory
    free(temp); or delete temp;
```
2) Delete from End:
```
Point head to the previous element i.e. last second element
    Change next pointer to null
    struct node *end = head;
    struct node *prev = NULL;
    while(end->next)
    {
        prev = end;
        end = end->next;
    }
    prev->next = NULL;
    
Make sure to free unused memory
    free(end); or delete end;
```
3) Delete from Middle:
```
Keeps track of pointer before node to delete and pointer to node to delete
    temp = head;
    prev = head;
    for(int i = 0; i < position; i++)
    {
        if(i == 0 && position == 1)
            head = head->next;
            free(temp)
        else
        {
            if (i == position - 1 && temp)
            {
                prev->next = temp->next;
                free(temp);
            }
            else
            {
                prev = temp;
                if(prev == NULL) // position was greater than number of nodes in the list
                    break;
                temp = temp->next; 
            }
        }
    }
```
## Iterative Method to delete an element from the linked list:
To delete a node from the linked list, we need to do the following steps:

Find the previous node of the node to be deleted. 
Change the next of the previous node. 
Free memory for the node to be deleted.
 
Time Complexity: O(n)<br>
Auxiliary Space: O(1)

## Recursive Method to delete a node from linked list:
To delete a node of a linked list recursively we need to do the following steps:

We pass node* (node pointer) as a reference to the function (as in node* &head)<br>
Now since the current node pointer is derived from the previous node’s next (which is passed by reference)<br>
so now if the value of the current node pointer is changed, the previous next node’s value also gets changed<br>
which is the required operation while deleting a node (i.e points previous node’s next to current node’s (containing key) next).<br>
Find the node containing the given value.<br>
Store this node to deallocate it later using the free() function.<br>
Change this node pointer so that it points to its next and by performing this previous node’s next also gets properly linked.<br>
Image showing deletion of a node.
```
![image](https://user-images.githubusercontent.com/61406986/204337820-116752b8-64ab-4ce4-8cc1-edab1446117a.png)
```
Time Complexity: O(n)<br>
Auxiliary Space: O(n) (due to recursion call stack)

Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

