* Initialize variables **sum** and **max** to track the current sum and the maximum subarray sum, respectively. Set **sum** and **max** to the value of the first element in the array.
* Iterate through each element in the array starting from the second element.
* Update the sum by adding the current element. If the updated sum is greater than the current max, update max to the new sum.
* If the sum becomes negative, reset it to 0. This step ensures that if the cumulative sum becomes negative, it starts counting from zero again for the next subarray.
* After iterating through all elements, the value of max will be the maximum subarray sum.

# Time Complexity **O(n)**, where n is the length of the input array. The code performs a single pass through the array.
# Space Complexity **O(1)**. The algorithm uses only a constant amount of extra space for the variables sum and max.
