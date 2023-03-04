# Path Sum

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path 
such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
 
### Example 1:

![image](https://user-images.githubusercontent.com/61406986/222895329-bb7b638d-4ddc-4234-b321-aeb07c8eaba8.png)

```
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
```
### Example 2:

![image](https://user-images.githubusercontent.com/61406986/222895337-8f9870d7-b0ea-4b4a-a3a3-abb7b16a9b55.png)

```
Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
```
### Example 3:
```
Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.
``` 

### Constraints:

The number of nodes in the tree is in the range [0, 5000].<br>
-1000 <= Node.val <= 1000<br>
-1000 <= targetSum <= 1000
