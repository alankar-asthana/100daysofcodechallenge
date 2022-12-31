# Introduction to Queue – Data Structure and Algorithm Tutorials

**What is Queue?**
A queue is a linear data structure that is open at both ends and the operations are performed in First In First Out (FIFO) order.

We define a queue to be a list in which all additions to the list are made at one end, and all deletions from the list are made at the other end.<br>  
The element which is first pushed into the order, the operation is first performed on that.

## FIFO Principle of Queue:
A Queue is like a line waiting to purchase tickets, where the first person in line is the first person served. (i.e. First come first serve).
Position of the entry in a queue ready to be served, that is, the first entry that will be removed from the queue, is called the front of the queue(sometimes, head of the queue), similarly, the position of the last entry in the queue, that is, the one most recently added, is called the rear (or the tail) of the queue. See the below figure.

![image](https://user-images.githubusercontent.com/61406986/210135100-1cff1543-a1b0-4565-8e4c-34a7b8c1f942.png)

## Basic Operations for Queue in Data Structure:

1. Enqueue() – Adds (or stores) an element to the end of the queue..
2. Dequeue() – Removal of elements from the queue.
3. Peek() or front()- Acquires the data element available at the front node of the queue without deleting it.
4. rear() – This operation returns the element at the rear end without removing it.
5. isFull() – Validates if the queue is full.
6. isNull() – Checks if the queue is empty.

### 1. Enqueue(): 
Enqueue() operation in Queue adds (or stores) an element to the end of the queue.<br>
The following steps should be taken to enqueue (insert) data into a queue:

Step 1: Check if the queue is full.<br>
Step 2: If the queue is full, return overflow error and exit.<br>
Step 3: If the queue is not full, increment the rear pointer to point to the next empty space.<br>
Step 4: Add the data element to the queue location, where the rear is pointing.<br>
Step 5: return success.<br>

![image](https://user-images.githubusercontent.com/61406986/210135185-4e272c0d-2934-484e-b593-e22c1d4c8b1c.png)

### 2. Dequeue(): 
Removes (or access) the first element from the queue.<br>
The following steps are taken to perform the dequeue operation:

Step 1: Check if the queue is empty.<br>
Step 2: If the queue is empty, return the underflow error and exit.<br>
Step 3: If the queue is not empty, access the data where the front is pointing.<br>
Step 4: Increment the front pointer to point to the next available data element.<br>
Step 5: The Return success.<br>

![image](https://user-images.githubusercontent.com/61406986/210135228-cc02c0e6-59c6-4dd9-a1eb-cca6b5427e0e.png)
