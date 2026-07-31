class Solution {
    public int countComponents(int n, int[][] edges) {
     boolean[] isVisited=new boolean[n];

     ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
     for(int i=0;i<n;i++){
        adjList.add(new ArrayList<>());
     }

     for(int i=0;i<edges.length;i++){
        adjList.get(edges[i][0]).add(edges[i][1]);
        adjList.get(edges[i][1]).add(edges[i][0]);
     }
      int res=0;
     for(int i=0;i<n;i++){
         if(!isVisited[i]){
            res++;
            dfs(i,adjList,isVisited);
         }
     }
     return res;
    }

    void dfs(int vertex,ArrayList<ArrayList<Integer>> adjList,boolean[] visited){
        visited[vertex]=true;
        for(int v:adjList.get(vertex)){

            if(visited[v]) continue;

            dfs(v,adjList,visited);
        }
    }
}
