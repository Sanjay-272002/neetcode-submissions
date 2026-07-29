class Solution {
    public void solve(char[][] board) {
       int r=board.length;
       int c=board[0].length;
       boolean[][] visited=new boolean[r][c];
       for(int i =0;i<r;i++){
            if(board[i][0] == 'O' && visited[i][0] == false){

                DFS(board,i,0,visited);
            }
            if(board[i][c-1] == 'O' && visited[i][c-1] == false){
                DFS(board,i,c-1,visited);
            }
        }
       
        for(int j = 0;j<c;j++){
            if(board[0][j] == 'O' && visited[0][j] == false){
                DFS(board,0,j,visited);
            }
            if(board[r-1][j] == 'O' && visited[r-1][j] == false){
                DFS(board,r-1,j,visited);
            }
        }

    
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
        
                if(board[i][j] == 'O' && !visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }
    void DFS(char[][] board,int r,int c,boolean[][] visited){
        int [] delRow={0,-1,0,1};
        int [] delCol={-1,0,1,0};
        visited[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+delRow[i];
            int nc=c+delCol[i];
            if(nr<0 || nc<0 || nr>=board.length || nc>=board[0].length || board[nr][nc]=='X' || visited[nr][nc]) continue;
           
            DFS(board,nr,nc,visited);
            
        }
      
    }
}