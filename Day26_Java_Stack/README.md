# Introduction to Stack – Data Structure and Algorithm Tutorials


It is a linear data structure that follows a particular order in which the operations are performed.

To implement the stack, it is required to maintain the pointer to the top of the stack,<br>
which is the last element to be inserted because we can access the elements only on the top of the stack.

### LIFO( Last In First Out ):
```
This strategy states that the element that is inserted last will come out first. 
You can take a pile of plates kept on top of each other as a real-life example. 
The plate which we put last is on the top and since we remove the plate that is at the top, 
we can say that the plate that was put last comes out first.
```
## Basic Operations on Stack

**-> push()** to insert an element into the stack<br>
**-> pop()** to remove an element from the stack<br>
**-> top()** Returns the top element of the stack.<br>
**-> isEmpty()** returns true if stack is empty else false.<br>
**-> size()** returns the size of stack.<br>

![image](https://user-images.githubusercontent.com/61406986/209988197-3a644089-600c-4fda-bb6d-3e7b2e1de40c.png)


## Push:
Adds an item to the stack. If the stack is full, then it is said to be an Overflow condition.

Algorithm for push:
```
begin
 if stack is full
    return
 endif
else  
 increment top
 stack[top] assign value
end else
end procedure
```
## Pop:
Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.

Algorithm for pop:
```
begin
 if stack is empty
    return
 endif
else
 store value of stack[top]
 decrement top
 return value
end else
end procedure
```
## Top:
Returns the top element of the stack.

Algorithm for Top:
```
begin 
  return stack[top]
end procedure
```
## isEmpty:
Returns true if the stack is empty, else false.

Algorithm for isEmpty:
```
begin
 if top < 1
    return true
 else
    return false
end procedure
```

## Complexity Analysis:
### Time Complexity

**Operations  +	Complexity**<br>
->push()        +  O(1)<br>
->pop()   	    + O(1)<br>
->isEmpty() 	  +  O(1)<br>
->size()	      +  O(1)
