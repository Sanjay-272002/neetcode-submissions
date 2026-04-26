class Solution {
    public boolean isValidSudoku(char[][] board) {
       return isValid(board,0,0); 
    }
    boolean isValid(char[][] board, int row,int col){
        if(row==board.length-1 && col==board[0].length-1){
            if(board[row][col]=='.') return true;
            return isSafe(board,board[row][col],row,col);
        }
        if(col==board[0].length){
            return isValid(board,row+1,0);
        }
        if(board[row][col]=='.') return isValid(board,row,col+1);
        if(!isSafe(board,board[row][col],row,col)) return false;

        return isValid(board,row,col+1);
    }
    boolean isSafe(char[][] mat,char c,int row,int col ){
        for (int i = 0; i < 9; i++) {
        if (i != row && mat[i][col] == c)
            return false;

        if (i != col && mat[row][i] == c)
            return false;

        int r = 3 * (row / 3) + i / 3;
        int cIdx = 3 * (col / 3) + i % 3;

        if ((r != row || cIdx != col) && mat[r][cIdx] == c)
            return false;
    }
    return true;
    }
}
