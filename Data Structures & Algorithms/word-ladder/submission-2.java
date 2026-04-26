class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> qu=new LinkedList<>();
        Set<String> visited=new HashSet<>();
         if(!wordList.contains(endWord)){
            return 0;
         }
        qu.offer(beginWord);
        visited.add(beginWord);
        int cn=1;
        while(!qu.isEmpty()){
            int size=qu.size();
      for(int l=0;l<size;l++){  
         String curr=qu.poll();
         for(int i=0;i<curr.length();i++){
            for(int j=0;j<26;j++){
                char cu=(char)(j+'a');
                String s=curr.substring(0,i)+cu+curr.substring(i+1,curr.length());
                if(s.equals(endWord)) return ++cn;
                if(wordList.contains(s) &&!visited.contains(s) ){
                  
                    qu.offer(s);
                    visited.add(s);
                }
            }
         }
          }
          cn++;
        }
        return 0;
    }
}
