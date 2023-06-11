# Approach:

* Create a HashMap to store the elements of the input array and their corresponding indices.
* Iterate through the array, and for each element:
  * Check if the complement (target - current element) is present in the HashMap.
  * If found, return an array containing the indices of the current element and its complement.
  * Otherwise, add the current element and its index to the HashMap.

* If no two elements are found that sum up to the target, return the default result array.

# Time Complexity is O(n)
# Space Complexity is O(n)
