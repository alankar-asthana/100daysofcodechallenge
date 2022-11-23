Array = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17}
Corresponding Complete Binary Tree is:

                 1
              /     \
           3         5
        /    \     /  \
      4      6   13  10
     / \    / \
   9   8  15 17

The task to build a Max-Heap from above array.

Total Nodes = 11.
Last Non-leaf node index = (11/2) – 1 = 4.
Therefore, last non-leaf node = 6.

To build the heap, heapify only the nodes: [1, 3, 5, 4, 6] in reverse order.

Heapify 6: Swap 6 and 17.

                 1
              /     \
           3         5
        /    \      /  \
     4      17   13  10
    / \    /  \
  9   8  15   6

Heapify 4: Swap 4 and 9.

                 1
              /     \
           3         5
        /    \      /  \
     9      17   13  10
    / \    /  \
  4   8  15   6

Heapify 5: Swap 13 and 5.

                 1
              /     \
           3         13
        /    \      /  \
     9      17   5   10
    / \    /  \
 4   8  15   6

Heapify 3: First Swap 3 and 17, again swap 3 and 15.

                 1
             /     \
        17         13
       /    \      /  \
    9      15   5   10
   / \    /  \
 4   8  3   6

Heapify 1: First Swap 1 and 17, again swap 1 and 15, finally swap 1 and 6.

                 17
              /      \
          15         13
         /    \      /  \
       9      6    5   10
      / \    /  \
    4   8  3    1

Heap Sort Algorithm
To solve the problem follow the below idea:

 First convert the array into heap data structure using heapify, than one by one delete the root node of the Max-heap and replace it with the last node in the heap and then heapify the root of the heap. Repeat this process until size of heap is greater than 1.

Follow the given steps to solve the problem:

Build a max heap from the input data. 
At this point, the maximum element is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of the heap by 1. Finally, heapify the root of the tree. 
Repeat step 2 while the size of the heap is greater than 1.
Note: The heapify procedure can only be applied to a node if its children nodes are heapified. So the heapification must be performed in the bottom-up order.

Detailed Working of Heap Sort
To understand heap sort more clearly, let’s take an unsorted array and try to sort it using heap sort.
Consider the array: arr[] = {4, 10, 3, 5, 1}.

Build Complete Binary Tree: Build a complete binary tree from the array.

Build complete binary tree from the array
Build complete binary tree from the array

Transform into max heap: After that, the task is to construct a tree from that unsorted array and try to convert it into max heap.

To transform a heap into a max-heap, the parent node should always be greater than or equal to the child nodes
Here, in this example, as the parent node 4 is smaller than the child node 10, thus, swap them to build a max-heap.
Transform it into a max heap image widget

Now, as seen, 4 as a parent is smaller than the child 5, thus swap both of these again and the resulted heap and array should be like this:
Make the tree a max heap
Make the tree a max heap

Perform heap sort: Remove the maximum element in each step (i.e., move it to the end position and remove that) and then consider the remaining elements and transform it into a max heap.

Delete the root element (10) from the max heap. In order to delete this node, try to swap it with the last node, i.e. (1). After removing the root element, again heapify it to convert it into max heap.
Resulted heap and array should look like this:
Remove 10 and perform heapify
Remove 10 and perform heapify

Repeat the above steps and it will look like the following:
Remove 5 and perform heapify
Remove 5 and perform heapify

Now remove the root (i.e. 3) again and perform heapify.
Remove 4 and perform heapify
Remove 4 and perform heapify

Now when the root is removed once again it is sorted. and the sorted array will be like arr[] = {1, 3, 4, 5, 10}.
The sorted array
The sorted array
