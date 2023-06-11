# Approach:

* Sort the input array in ascending order.
* Iterate through the array using two nested loops:
  * The outer loop selects the first element of the potential quadruplet.
  * The inner loop selects the second element of the potential quadruplet.

* Inside the nested loops, use two pointers (low and high) to find the remaining two elements.
  * Initialize the low pointer as j + 1 and the high pointer as the last index of the array.
  * Calculate the sum of the selected elements from the outer and inner loops.
  * Compare the sum with the target value and adjust the pointers accordingly.
  * If the sum matches the target, add the quadruplet to the result list and move the pointers to avoid duplicates.

* Continue the iteration until all possible quadruplets have been considered.
* Return the result list containing all valid quadruplets.

# Time Complexity is  O(n^3) we uses nested loops to iterate through the input array, resulting in a cubic time complexity.
# Space Complexity is  O(1)
