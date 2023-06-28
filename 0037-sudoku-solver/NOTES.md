* The solveSudoku method takes a 2D array board representing the Sudoku puzzle and attempts to solve it. It returns true if a solution is found, and false otherwise.
* The code uses a nested loop to iterate through each cell in the Sudoku grid.
* For each empty cell (represented by '.'), the code tries to place a valid digit from '1' to '9' and checks if it leads to a valid solution.
* The isValid method is called to check if placing the digit c at the given row and col is valid according to Sudoku rules. It checks three conditions:
   * No same digit appears in the same column.
   * No same digit appears in the same row.
  * No same digit appears in the same 3x3 subgrid.

* If the digit c is valid at the current position, it is placed in the board[i][j] cell.
* Recursive backtracking is then used by calling solveSudoku recursively on the updated board.
* If solveSudoku returns true, it means a solution is found, and the method returns true to propagate the success.
* If solveSudoku returns false, it means the current placement of digits does not lead to a valid solution. In this case, the previously placed digit is replaced with '.' to backtrack and explore other possibilities.
* If no empty cell is found (all cells are filled), the method returns true, indicating a valid solution is found.
   #  time complexity is O(9^(n^2)), where n is the number of cells in each row or column (usually 9 for a standard Sudoku puzzle).
  # space complexity is O(1) 



https://www.youtube.com/watch?v=FWAIf_EVUKE&t=1466s​
