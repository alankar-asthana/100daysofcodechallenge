Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:<br>
![image](https://user-images.githubusercontent.com/61406986/210732112-86d139bb-6877-42da-bcb8-a905beabd0eb.png)
```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```
Example 2:
```
Input: head = [1], n = 1
Output: []
```
Example 3:
```
Input: head = [1,2], n = 1
Output: [1]
``` 
Constraints:

The number of nodes in the list is sz.<br>
1 <= sz <= 30<br>
0 <= Node.val <= 100<br>
1 <= n <= sz
