class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] inDegree=new int[numCourses];
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){

            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
            inDegree[prerequisites[i][1]]++;
        }
       Queue<Integer> qu =new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0) qu.offer(i);
        }
      int cn=0;
        while(!qu.isEmpty()){
          int vertex=qu.poll();
          cn++;

          for(int v:adjList.get(vertex)){

            inDegree[v]--;
            if(inDegree[v]==0)qu.offer(v);
          }

        }

        return cn==numCourses;
    }
}
