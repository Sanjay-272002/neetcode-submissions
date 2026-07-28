class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> qu=new LinkedList<>();
        int freshcn=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    qu.offer(new int[]{i,j});
                }else if(grid[i][j]==1) freshcn++;
            }
        }
        int [] delRow={0,-1,0,1};
        int [] delCol={-1,0,1,0};
        int step=0;
        while(!qu.isEmpty()){
            int size=qu.size();
            boolean isFound=false;
            for(int t=0;t<size;t++){
            int [] cell=qu.poll();
            for(int i=0;i<4;i++){
                int nr=cell[0]+delRow[i];
                int nc=cell[1]+delCol[i];
                if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc]!=1) continue;
                if(grid[nr][nc]==1){
                    qu.offer(new int[]{nr,nc});
                    isFound=true;
                    freshcn--;
                    grid[nr][nc]=2;
                }
            }
            }
           if(isFound) step++;
        }
        return (freshcn!=0)?-1:step;
    }
}
