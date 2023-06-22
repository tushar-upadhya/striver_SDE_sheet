# approach
* Initialize count and maxCount as before.
* Iterate through the nums array using a for loop.
* For each element num in the array:​
*  * Calculate count using the XOR approach: (count + num) * num. If num is 1, adding 1 to count maintains the consecutive count; if num is 0, multiplying by 0 resets count to 0.
   * Update maxCount by taking the maximum value between the current maxCount and the count, as before.
* Return the final value of maxCount, representing the maximum number of consecutive ones.

# time complexity is O(N) 
# space complexity is O(1) 
