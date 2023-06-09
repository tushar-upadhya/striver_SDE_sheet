# approach 

* Initialize two candidate variables num1 and num2 with initial values of -1.
* Initialize two count variables count1 and count2 to keep track of the frequencies of the candidates.
* Iterate through the nums array:
  * If the current number num is equal to num1, increment count1.
  * If the current number num is equal to num2, increment count2.
  * If count1 is 0, update num1 with the current number num and set count1 to 1.
  * If count2 is 0, update num2 with the current number num and set count2 to 1.
  * If none of the above conditions are met, decrement both count1 and count2.

* Reset count1 and count2 to 0.
* Iterate through the nums array again:
  * If the current number num is equal to num1, increment count1.
  * If the current number num is equal to num2, increment count2.

* Create a result list.
* If count1 is greater than n/3, where n is the length of nums, add num1 to the result list.
* If count2 is greater than n/3, add num2 to the result list.
* Return the result list.

#  time complexity  O(n), where n is the length of the input array nums. 
#  space complexity is O(1) 
