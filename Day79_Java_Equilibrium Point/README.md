# Equilibrium index of an array

Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) 
that returns an equilibrium index (if any) or -1 if no equilibrium index exists. 

The equilibrium index of an array is an index such that the sum of elements at lower 
indexes is equal to the sum of elements at higher indexes. 

### Examples: 
```
Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
Output: 3 
3 is an equilibrium index, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]


Input: A[] = {1, 2, 3} 
Output: -1 
```

## Equilibrium index of an Array using Array-Sum:
To solve the problem follow the below idea:

The idea is to get the total sum of the array first. Then Iterate through the array and keep updating 
the left sum which is initialized as zero. In the loop, we can get the right sum by subtracting the 
elements one by one. Thanks to Sambasiva for suggesting this solution and providing code for this.

### Follow the given steps to solve the problem:
```
1. Initialize leftsum  as 0
2. Get the total sum of the array as sum
3. Iterate through the array and for each index i, do the following:
4. Update the sum to get the right sum.  
5. sum = sum – arr[i] 
6. The sum is now the right sum
7. If leftsum is equal to the sum, then return the current index. 
8. update left sum for the next iteration.
9. leftsum = leftsum + arr[i]
10. Return -1 
11. If we come out of the loop without returning then there is no equilibrium index
```
The image below shows the dry run of the above approach: 

![image](https://user-images.githubusercontent.com/61406986/219114228-415060ab-a267-473a-9be7-553a32a791ed.png)

Time Complexity: O(N)<br>
Auxiliary Space: O(1)
