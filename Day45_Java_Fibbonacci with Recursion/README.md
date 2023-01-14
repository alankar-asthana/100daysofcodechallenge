In case of fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21 etc. The first two numbers of fibonacci series are 0 and 1.

There are two ways to write the fibonacci series program:

Fibonacci Series without recursion<br>
Fibonacci Series using recursion

![image](https://user-images.githubusercontent.com/61406986/212483812-2aa26494-828b-4372-a0ff-1d32f60b6b20.png)

## Method 1 – Iterative:
Initialize the first and second numbers to 0 and 1. Following this, we print the first and second numbers. Then we send the flow to the iterative while loop where we get the next number by adding the previous two number and simultaneously we swap the first number with the second and the second with the third.

**Time Complexity: O(N) <br>
Auxiliary Space: O(1)**

## Method 2 – Using Recursion: 

Since Fibonacci Number is the summation of the two previous numbers. We can use recursion as per the following condition:

Get the number whose Fibonacci series needs to be calculated.
Recursively iterate from value N to 1:
**Base case: **If the value called recursively is less than 1, the return 1 the function.
**Recursive call:** If the base case is not met, then recursively call for previous two value as:
```
recursive_function(N – 1) + recursive_function(N – 2);
```

**Return statement:** At each recursive call(except the base case), return the recursive function for the previous two value as:
```
recursive_function(N – 1) + recursive_function(N – 2);
```

**Time Complexity: O(2N)<br>
Auxiliary Space: O(1)
**
## Method 3 – Using Dynamic Programming: 

We can avoid the repeated work done in method 2 by storing the Fibonacci numbers calculated so far. Below are the steps:

1. Create an array arr[] of size N.
2. Initialize arr[0] = 0, arr[1] = 1.
3. Iterate over [2, N] and update the array arr[] as:
```
arr[i] = arr[i – 2] + arr[i – 1]
```
