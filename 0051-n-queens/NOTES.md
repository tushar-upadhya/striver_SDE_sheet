# approach
* The solveNQueens method initializes a 2D board of size N x N and fills it with periods ('.') to represent empty cells. It also initializes the result list to store all the valid solutions.

* Three arrays, left_Row, lower_Diagonal, and upper_Diagonal, are initialized to keep track of the availability of rows, lower diagonals, and upper diagonals respectively. These arrays help in checking the validity of queen placements.
* The solve method is a recursive function that solves the N-Queens problem. It takes the current column col, the board, the result list, and the arrays mentioned above as parameters.
* If the col reaches the length of the board, it means all queens have been successfully placed in valid positions. In this case, the board is converted into a list of strings using the construct method, and this valid solution is added to the result list.
* If the col is less than the length of the board, the code iterates through each row in the current column to find a valid position for the queen.
* The code checks three conditions to determine if a position is valid: left_Row[row], lower_Diagonal[row + col], and upper_Diagonal[board.length - 1 + col - row]. If all three conditions are met, it means the position is valid, and the queen can be placed there.
* If a valid position is found, the board is updated by placing the queen ('Q') at the position, and the corresponding values in the arrays left_Row, lower_Diagonal, and upper_Diagonal are set to 1 to mark them as occupied.
* The solve method is then called recursively with the next column (col + 1) to continue placing queens in subsequent columns.
* After the recursive call, the changes made to the board and arrays are reverted to backtrack and explore other possible solutions. The queen is removed from the current position, and the corresponding values in the arrays are set back to 0.
* Once all iterations are complete, the solveNQueens method returns the result list containing all the valid solutions.
* The construct method converts the 2D board into a list of strings. Each row of the board is converted into a string, and all these strings are added to the result list.

  #  time complexity  is  O(N!), as there are N! possible configurations to check.
  # space complexity is O(N)
