

Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 
### Example 1:

![image](https://user-images.githubusercontent.com/61406986/222890332-89cc4db3-45f4-4e09-addb-b8a9ddfbe3a3.png)

```
Input: p = [1,2,3], q = [1,2,3]
Output: true
```
### Example 2:

![image](https://user-images.githubusercontent.com/61406986/222890341-0ddc0b51-e5b7-4994-8480-2edebf0d68a1.png)

```
Input: p = [1,2], q = [1,null,2]
Output: false
```
### Example 3:

![image](https://user-images.githubusercontent.com/61406986/222890354-5a84634c-438f-447d-b1a0-4fd1a9b500c5.png)

```
Input: p = [1,2,1], q = [1,1,2]
Output: false
```
### Constraints:

The number of nodes in both trees is in the range [0, 100].<br>
-104 <= Node.val <= 104
