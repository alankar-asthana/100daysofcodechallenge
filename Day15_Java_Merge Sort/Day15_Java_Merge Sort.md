The Merge Sort algorithm is a sorting algorithm that is based on the Divide and Conquer paradigm. In this algorithm, the array is initially divided into two equal 
halves and then they are combined in a sorted manner.

Merge Sort Working Process:
Think of it as a recursive algorithm continuously splits the array in half until it cannot be further divided. This means that if the array becomes empty or has only one 
element left, the dividing will stop, i.e. it is the base case to stop the recursion. If the array has multiple elements, split the array into halves and recursively 
invoke the merge sort on each of the halves. Finally, when both halves are sorted, the merge operation is applied. Merge operation is the process of taking two smaller 
sorted arrays and combining them to eventually make a larger one.

Illustration:
To know the functioning of merge sort, lets consider an array arr[] = {38, 27, 43, 3, 9, 82, 10}

At first, check if the left index of array is less than the right index, if yes then calculate its mid point
![image](https://user-images.githubusercontent.com/61406986/202919147-cd459e79-1a81-449e-9804-3dbe34803e2b.png)

Now, as we already know that merge sort first divides the whole array iteratively into equal halves, unless the atomic values are achieved. 
Here, we see that an array of 7 items is divided into two arrays of size 4 and 3 respectively.
![image](https://user-images.githubusercontent.com/61406986/202919159-32209067-39e1-4d44-9bba-f816e469fdb6.png)

Now, again find that is left index is less than the right index for both arrays, if found yes, then again calculate mid points for both the arrays.
![image](https://user-images.githubusercontent.com/61406986/202919169-cfff2d74-611d-4120-863d-96495465f7ab.png)

Now, further divide these two arrays into further halves, until the atomic units of the array is reached and further division is not possible.
![image](https://user-images.githubusercontent.com/61406986/202919183-2c5340bf-88ce-4030-ae2e-cd8def8a0b92.png)

After dividing the array into smallest units, start merging the elements again based on comparison of size of elements
Firstly, compare the element for each list and then combine them into another list in a sorted manner.
![image](https://user-images.githubusercontent.com/61406986/202919192-f74aa393-78f4-4671-86a0-9c9296b95f16.png)

After the final merging, the list looks like this:
![image](https://user-images.githubusercontent.com/61406986/202919201-00ab44f8-a7b0-41d6-9285-c326d7b363b4.png)

