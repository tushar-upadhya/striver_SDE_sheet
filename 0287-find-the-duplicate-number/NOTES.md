* Create a boolean array visited of size nums.length + 1 to track visited numbers.
* Iterate through each number num in the nums array.
  * Check if the num has been visited before by checking the corresponding index in the visited array.
  * If the number has been visited, return it as the duplicate number.
  * Mark the number as visited by setting the corresponding index in the visited array to true.

* If no duplicate number is found, return 0 as the default value.

#  time complexity of the code is O(n), where n is the length of the nums array. This is because the code iterates through each element of the array once
# pace complexity is O(n), where n is the length of the nums array. This is because the code uses an additional boolean array visited of size nums.length + 1 to track visited numbers
