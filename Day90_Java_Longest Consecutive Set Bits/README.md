# Longest Consecutive Set Bits

Given a number N, The task is to find the length of the longest consecutive 1s series in its binary representation after fliping the each non-set bit.

### Examples : 
```
Input: N = 14
Output: 4
Explanation: The binary representation of 14 is 1110. If we flip the last bit i.e. zero to one then binary representationis 1111. 
Now total count of set bit is 4.

Input: N = 222
Output: 7
Explanation: 
The binary representation of 222 is 11011110. If we flip the last zero then binary representation is 11011111. 
Then the count of consecutive 1s till we fing the next zero is 5. 
If we flip the zero which is at third place then binary representation is 11111110.
Then the count of consecutive 1s till we fing the next zero is 7. Here next zero means we will consider the zero in the begining of binary representation.
Now flip the begining zero also, then the binary representation will be 111011110. Including that bit length of consecutive ones is 3.

Hence we found that longest sequence of consecutive set bits is 7.
```
### Constraints

-2^32 < N < 2^32-1
