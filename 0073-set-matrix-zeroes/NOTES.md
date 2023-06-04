# approach

- Create two sets, **row** and **col**, to keep track of the rows and columns that need to be set to 0.
- Iterate through the matrix and whenever a 0 is encountered at position **(i, j)**, add **i** to the row set and **j** to the **col** set.
- Iterate through the matrix again and for each element at position **(i, j)**, if either **i** is in the **row** set or **j** is in the **col** set, set the element to 0.


# Time Complexity 
- Iterating through the matrix to identify the rows and columns with 0 elements requires visiting each element once. This process has a time complexity of O(r * c), where r is the number of rows and c is the number of columns in the matrix.
- Iterating through the matrix again to set the corresponding rows and columns to 0 also requires visiting each element once. This process also has a time complexity of O(r * c).
 - Therefore, the overall time complexity is O(r * c + r * c) = O(r * c), where r is the number of rows and c is the number of columns

# Space Complexity

- The space complexity is determined by the two sets, row and col, which store the row and column indices containing 0 elements. The sizes of these sets depend on the number of rows and columns with 0 elements in the matrix.
- In the worst case scenario, if all elements in the matrix are 0, then both row and col sets will contain r + c elements, where r is the number of rows and c is the number of columns.
- Therefore, the space complexity is O(r + c), where r is the number of rows and c is the number of columns.
