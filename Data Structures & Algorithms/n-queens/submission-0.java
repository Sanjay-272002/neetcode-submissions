class Solution {
    public List<List<String>> solveNQueens(int n) {
        String[][] chess=new String[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(chess[i],".");
        }
        return formQueens(chess,0);
    }

   List<List<String>> formQueens(String[][] chess,int r){
        List<List<String>> result=new ArrayList<>();
      if(r==chess.length){
List<String> loop=new ArrayList<>();
            for(String [] rowv:chess){
                loop.add(String.join("",rowv));
            }
            result.add(loop);
            return result;
      } 

      for(int i=0;i<chess[0].length;i++){
        if(isSafe(chess,r,i)){
            chess[r][i]="Q";
            result.addAll(formQueens(chess,r+1));
            chess[r][i]=".";
        }
      }

      return result;
    }

    boolean isSafe(String[][]chess,int r,int c){
        for(int row=0;row<chess.length;row++){
            if(chess[row][c].equals("Q")) return false;
        }
        int  maxLeft=Math.min(r,c);
      int maxRight=Math.min(r,chess.length-c-1);
       for(int i=1;i<=maxLeft;i++){
        if(chess[r-i][c-i].equals("Q"))
        return false;
       }

       for(int i=1;i<=maxRight;i++){
        if(chess[r-i][c+i].equals("Q"))
        return false;
       }

       return true;
    }
}
