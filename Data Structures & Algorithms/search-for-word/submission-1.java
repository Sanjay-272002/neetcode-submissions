class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
         boolean[][] isVisited=new boolean[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
             if(doesExist(board,isVisited,i,j,0,word)){
                return true;
             }
            }
         }
        return false;
    }

    boolean doesExist(char[][] board,boolean[][] isVisited,int  r,int c,int cn,String word){
        if(cn==word.length()){
           return true;
        }
        if(board[r][c] !=word.charAt(cn)) return false;
        if (cn == word.length() - 1)
    return true;
        isVisited[r][c]=true;
         int [] delRow={0,-1,0,1};
        int [] delCol={-1,0,1,0};
        
        for(int i=0;i<4;i++){
            int newRow=r+delRow[i];
            int newCol=c+delCol[i];
            if(newRow<0 || newRow>=board.length || newCol<0 || newCol>=board[0].length || isVisited[newRow][newCol]) continue;
            
            if(doesExist(board,isVisited,newRow,newCol,cn+1,word)){
                return true;
            }
            
        }
         isVisited[r][c]=false;
        return false;
    }
}
