# Sieve of Eratosthenes

Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number. 

### Example: 
```
Input : n =10
Output : 2 3 5 7 

Input : n = 20 
Output: 2 3 5 7 11 13 17 19
```
Let us take an example when n = 50. So we need to print all prime numbers smaller than or equal to 50. 

We create a list of all numbers from 2 to 50.  

![image](https://user-images.githubusercontent.com/61406986/213878059-8b9a32a1-52a6-448e-a9a1-da3f084d8103.png)

According to the algorithm we will mark all the numbers which are divisible by 2 and are greater than or equal to the square of it. 

![image](https://user-images.githubusercontent.com/61406986/213878079-c378698d-5e2a-4c9b-b613-43595925bf49.png)

Now we move to our next unmarked number 3 and mark all the numbers which are multiples of 3 and are greater than or equal to the square of it. 

![image](https://user-images.githubusercontent.com/61406986/213878099-5ca21aa9-51fa-473a-82e4-f53aa5d04505.png)

We move to our next unmarked number 5 and mark all multiples of 5 and are greater than or equal to the square of it.  

![image](https://user-images.githubusercontent.com/61406986/213878125-caea6369-bb16-4aff-9343-673b58ef4825.png)

We continue this process and our final table will look like below:  

![image](https://user-images.githubusercontent.com/61406986/213878143-7a92f487-cfa4-4b2a-aa59-3cee01000680.png)


So the prime numbers are the unmarked ones: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47.
