class Solution {
    int cn=0;
    public boolean validTree(int n, int[][] edges) {
       boolean[] visited=new boolean[n];
       ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
       for(int i=0;i<n;i++){
        adjList.add(new ArrayList<>());
       }

       for(int i=0;i<edges.length;i++){
        adjList.get(edges[i][0]).add(edges[i][1]);
        adjList.get(edges[i][1]).add(edges[i][0]);
       }

       if(!isValid(adjList,0,-1,visited)) return false;
     return cn==n;

    }

    boolean isValid(ArrayList<ArrayList<Integer>> adjList,int vertex,int parent,boolean[] visited){

        visited[vertex]=true;
         boolean res=true;
         cn++;
        for(int v: adjList.get(vertex)){
            if( v==parent)continue;
            if(visited[v] )return false;

            if(!isValid(adjList,v,vertex,visited)) return false;
        }

        return true;
    }
}
