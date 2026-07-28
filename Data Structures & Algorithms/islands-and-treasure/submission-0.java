class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> qu=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) qu.offer(new int[]{i,j});
            }
        }

        int [] delRow={0,-1,0,1};
        int [] delCol={-1,0,1,0};
        while(!qu.isEmpty()){
         int [] curr=qu.poll();

         for(int i=0;i<4;i++){
            int nr=curr[0]+delRow[i];
            int nc=curr[1]+delCol[i];
            if(nr<0 ||nr>=grid.length || nc<0 || nc>=grid[0].length || grid[nr][nc]!=Integer.MAX_VALUE) continue;

            qu.offer(new int[]{nr,nc});
            grid[nr][nc]=grid[curr[0]][curr[1]]+1;
         }
        }
    }
}
