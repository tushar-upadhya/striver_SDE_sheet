* Initialize three pointers: **low, mid, and high**. low points to the start of the array, **mid** points to the current element being processed, and **high** points to the end of the array.
* Iterate through the array while the **mid** pointer is less than or equal to the high pointer.
* If the element at **nums[mid]** is 0, swap the element at nums[low] with the element at **nums[mid]**, and increment both low and mid pointers.
* If the element at **nums[mid]** is 1, simply increment the mid pointer.
* If the element at **nums[mid]** is 2, swap the element at nums[mid] with the element at **nums[high]**, and decrement the high pointer.
* Repeat steps 3-5 until the mid pointer reaches the high pointer, indicating that all elements have been processed.
*
# Time Complexity **O(n)**, where n is the length of the input array. The code performs a single pass through the array.
# Space Complexity **O(1)**. The algorithm uses only a constant amount of extra space.
