class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    res=Math.max(res,dfs(grid,i,j));
                }
            }
        }

        return res;
    }

    int dfs(int[][] grid,int r,int c){

        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return 0;

        grid[r][c]=0;

        int[] delRow={0,-1,0,1};
        int [] delCol={-1,0,1,0};
        int res=1;
        for(int i=0;i<4;i++){
            int nr=r+delRow[i];
            int nc=c+delCol[i];
           res=res+dfs(grid,nr,nc);
        }

        return res;
    }
}
