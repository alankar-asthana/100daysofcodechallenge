# Array to BST

Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced binary search tree.

### Example 1:

![image](https://user-images.githubusercontent.com/61406986/222894031-641a9a8d-43af-4d25-82ce-f8b1ee2ef1cc.png)

```
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
```
![image](https://user-images.githubusercontent.com/61406986/222894040-4079b49d-96e6-45b6-8ddf-2ddb8fdd1cb8.png)

### Example 2:

![image](https://user-images.githubusercontent.com/61406986/222894056-6fb04d90-a5b6-4a1b-9ce9-edcb37861765.png)

```
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
``` 

### Constraints:

1 <= nums.length <= 104<br>
-104 <= nums[i] <= 104<br>
nums is sorted in a strictly increasing order.
