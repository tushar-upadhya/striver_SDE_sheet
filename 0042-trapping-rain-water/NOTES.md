# approach
* Initialize variables left and right as the left and right pointers, respectively, pointing to the first and last elements of the height array.
* Initialize variables res and maxLeft to store the total trapped water and the maximum height encountered from the left side, respectively.​
* Initialize variable maxRight to store the maximum height encountered from the right side.
* Use a while loop that runs while left is less than or equal to right to iterate through the array.
* Inside the loop, compare the heights of the boundaries at left and right:
*  * If the height at left is less than or equal to the height at right, it means that the left boundary is smaller or equal in height. So, we process the left boundary.
   * Check if the height at left is greater than or equal to maxLeft. If it is, update maxLeft with the new maximum height.
   * Otherwise, there is a potential trapped water at the current position. Calculate the difference between maxLeft and the height at left, and add it to res.
   * Increment left by 1 to move the left boundary to the next position.
*  * If the height at left is greater than the height at right, it means that the right boundary is smaller in height. So, we process the right boundary.
   * Check if the height at right is greater than or equal to maxRight. If it is, update maxRight with the new maximum height.
   * Otherwise, there is a potential trapped water at the current position. Calculate the difference between maxRight and the height at right, and add it to res.
   * Decrement right by 1 to move the right boundary to the previous position.
*  Finally, return the total trapped water stored in res.

# time complexity is O(N), where N is the size of the height array, as we only iterate through the array once
# space complexity is O(1)
