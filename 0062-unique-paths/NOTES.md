* Create a 2D grid with dimensions m rows and n columns to store the number of unique paths.
* Initialize the values of the first row and first column of the grid to 1 because there is only one possible path to reach any cell in the first row or column (by moving only right or down).
* Iterate through the remaining cells of the grid in row-major order (top to bottom, left to right).
* For each cell, calculate the number of unique paths to reach that cell by summing the number of paths from the cell above **(grid[i-1][j])** and the cell to the left **(grid[i][j-1])**.
* Store the calculated value in the current cell **(grid[i][j])**.
* After iterating through all cells, the value in the bottom-right cell **(grid[m-1][n-1])** will represent the total number of unique paths to reach the bottom-right corner of the grid.
* Return the value in the bottom-right cell.
 
 #  time complexity is O(m*n) as it iterates through all cells of the grid.
 # space complexity is O(m*n) as it uses a 2D grid to store the intermediate results.
