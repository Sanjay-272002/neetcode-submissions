class Solution {
    int [] delRow={0,-1,0,1};
    int [] delCol={-1,0,1,0};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
      int r=heights.length;
      int c=heights[0].length;

      boolean[][] isPacific=new boolean[r][c];
      boolean[][] isAtlantic=new boolean[r][c];

      for(int col=0;col<c;col++){
        dfs(0,col,isPacific,heights);
        dfs(r-1,col,isAtlantic,heights);
      }  

      for(int row=0;row<r;row++){
        dfs(row,0,isPacific,heights);
        dfs(row,c-1,isAtlantic,heights);
      }
     List<List<Integer>>  result=new ArrayList<>();
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(isPacific[i][j] && isAtlantic[i][j]){
                result.add(new ArrayList<>(List.of(i,j)));
            }
        }
      }
      return result;
    }

    void dfs(int row,int col,boolean[][] isOcean,int[][] heights){
        isOcean[row][col]=true;
        
        for(int i=0;i<4;i++){
            int nr=row+delRow[i];
            int nc=col+delCol[i];
            if(nr<0 || nc<0 || nr>=heights.length || nc>=heights[0].length || isOcean[nr][nc] || heights[nr][nc]<heights[row][col])continue;
            dfs(nr,nc,isOcean,heights);
        }
    }
}
