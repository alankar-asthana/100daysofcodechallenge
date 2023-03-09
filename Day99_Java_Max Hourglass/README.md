# Maximum sum of hour glass in matrix

Given a 2D matrix, the task is to find the maximum sum of an hourglass.

An hour glass is made of 7 cells
in following form.
    A B C
      D
    E F G

### Examples: 
```
Input : 1 1 1 0 0 
        0 1 0 0 0 
        1 1 1 0 0 
        0 0 0 0 0 
        0 0 0 0 0 
Output : 7
Below is the hour glass with
maximum sum:
1 1 1 
  1
1 1 1
                                                      
Input : 0 3 0 0 0
        0 1 0 0 0
        1 1 1 0 0
        0 0 2 4 4
        0 0 0 2 4
Output : 11
Below is the hour glass with
maximum sum
1 0 0
  4
0 2 4
```
### Approach:
It is evident from the definition of the hourglass that the number of rows and number of columns must be equal to 3. 
If we count the total number of hourglasses in a matrix, we can say that the count is equal to the count of possible 
top left cells in an hourglass. The number of top-left cells in an hourglass is equal to (R-2)*(C-2). Therefore, in a 
matrix total number of an hourglass is (R-2)*(C-2).
```
mat[][] = 2 3 0 0 0 
          0 1 0 0 0
          1 1 1 0 0 
          0 0 2 4 4
          0 0 0 2 0
Possible hour glass are :
2 3 0  3 0 0   0 0 0  
  1      0       0 
1 1 1  1 1 0   1 0 0 

0 1 0  1 0 0  0 0 0 
  1      1      0  
0 0 2  0 2 4  2 4 4 

1 1 1  1 1 0  1 0 0
  0      2      4
0 0 0  0 0 2  0 2 0
```
Consider all top left cells of hourglasses one by one. For every cell, we compute the sum of the hourglass formed by it. 
Finally, return the maximum sum.<br>

Time complexity: O(R x C).<br>
Auxiliary Space: O(1)
