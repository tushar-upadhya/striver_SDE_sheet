# Intuition
- Pascal's triangle is a triangular array of numbers in which each number is the sum of the two numbers directly above it.
- Each row in the triangle represents the coefficients of the binomial expansion of (a + b)^n, where n is the row number.

# Approach
- The code uses a nested loop to iterate through the rows and columns of the triangle.
- For each row, it creates a new list to store the elements of that row.
- It uses the indices i and j to determine the position of each element in the triangle.
- If j is 0 or equal to i, it means the element is at the beginning or end of the row and should be set to 1.
- Otherwise, the element is the sum of the corresponding elements from the previous row, which are accessed through the **pre** list.
- After constructing the current row, it sets **pre** to the current row for use in the next iteration.
- Finally, it adds the row to the result list.

# Time Complexity
- _O(numRows^2)_
- The code iterates through each row from 0 to numRows, and for each row, it iterates through the number of elements in that row (i.e., i+1 elements). Therefore, the total number of iterations is (1 + 2 + 3 + ... + numRows) = numRows * (numRows + 1) / 2.
- Thus, the time complexity is O(numRows^2).

# Space Complexity
- _O(numRows^2)_
- The space used by the code is proportional to the number of elements in the triangle, which is (1 + 2 + 3 + ... + numRows) = numRows * (numRows + 1) / 2.
- Therefore, the space complexity is O(numRows^2), as the code stores all the elements of the triangle in the result list.
