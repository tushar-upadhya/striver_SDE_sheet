# Approach:

* Initialize two variables: candidate and count. The candidate variable stores the potential majority element, and the count variable keeps track of its count.
* Iterate through the array nums:
   * If count is zero, update the candidate as the current element and set count to 1.
  * If the current element is the same as the candidate, increment the count.
  * If the current element is different from the candidate, decrement the count.
* At the end of the loop, the candidate will hold the majority element.

# Time complexity: O(n) 
# Time complexity: O(n)
