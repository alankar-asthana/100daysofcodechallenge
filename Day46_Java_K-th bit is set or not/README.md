Given a number N and a bit number K, check if the Kth bit of N is set or not. A bit is called set if it is 1. 
Note: Indexing starts with 0 from LSB (least significant bit) side in the binary representation of the number.

### Examples: 
```
Input: n = 5, k = 1
Output: SET
Explanation: 5 is represented as 101 in binary and has its first bit set.

Input: n = 2, k = 3
Output: NOT SET
Explanation: 2 is represented as 10 in binary, all higher i.e. beyond MSB, bits are NOT SET.
```

## Approach 1
### Check whether the K-th bit is set or not Using Left Shift Operator:
To solve the problem follow the below idea:
```
Left shift given number 1 by k to create a number that has only set bit as k-th bit.
temp = 1 << k
If bitwise AND of n and temp is non-zero, then result is SET else result is NOT SET.
```
**Time Complexity: O(1)<br>
Auxiliary Space: O(1)**

## Approach 2

### Check whether the K-th bit is set or not Using Right Shift Operator:
To solve the problem follow the below idea:
```
If we right shift n by k, we get the last bit as 1 if the Kth bit is set else 0
```
**Time Complexity: O(1)<br>
Auxiliary Space: O(1)**
