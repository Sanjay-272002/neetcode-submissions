class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                 dfs(grid,i,j);
                 res++;
                } 
            }
        }
        return res;
    }
    void dfs(char[][] grid,int row,int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]=='0') return;

        grid[row][col]='0';
        int[] delRow={0,-1,0,1};
        int[] delCol={-1,0,1,0};
        for(int i=0;i<4;i++){
            int nr=row+delRow[i];
            int nc=col+delCol[i];
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1') dfs(grid,nr,nc);
        }
        
        
        
            }
}
