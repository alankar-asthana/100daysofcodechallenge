# Remove Consecutive Vowels

Given a string s of lowercase letters, we need to remove equal consecutive vowels from the string

Note : Sentence should not contain two consecutive vowels ( a, e, i, o, u).

### Examples : 
```
Input: geeks for geeks
Output: geks for geks
```

Approach: Iterate string using a loop and check for the repetitiveness of vowels in a given sentence 
and in case if consecutive vowels are found then delete the vowel till coming next consonant and printing the updated string. 

Time Complexity: O(n)<br>
Space Complexity: O(n)
