class Solution {
    public List<List<String>> solveNQueens(int n) {
        
    char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
       
        List<List<String>> result = new ArrayList <List<String>> ();
       
        int left_Row[] = new int[n];
        int upper_Diagonal[] = new int[2 * n - 1];
        int lower_Diagonal[] = new int[2 * n - 1];
        
        solve(0, board, result, left_Row, lower_Diagonal, upper_Diagonal);
        return result;
    }



    static void solve(int col, char[][] board, List<List<String>> result, int left_Row[], int lower_Diagonal[], int upper_Diagonal[]) {

        if (col == board.length) {
            result.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (left_Row[row] == 0 && lower_Diagonal[row + col] == 0 && upper_Diagonal[board.length - 1 + col - row] == 0) {
               
                board[row][col] = 'Q';
                left_Row[row] = 1;
                lower_Diagonal[row + col] = 1;
                upper_Diagonal[board.length - 1 + col - row] = 1;
                
                solve(col + 1, board, result, left_Row, lower_Diagonal, upper_Diagonal);
                
                board[row][col] = '.';
                left_Row[row] = 0;
                lower_Diagonal[row + col] = 0;
                upper_Diagonal[board.length - 1 + col - row] = 0;
            }
        }
    }


    static List<String> construct(char[][] board) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String str = new String(board[i]);
            result.add(str);
        }
        return result;
    }
}
