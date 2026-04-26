class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        
        HashMap<Character,Integer> st=new HashMap<>();
        int start=0,end=0,min=Integer.MAX_VALUE;
        int n=s.length();
        int count = 0;
        String res="";
        while(end<n){
            char c = s.charAt(end);
            if(targetMap.containsKey(c)) {
                st.put(c, st.getOrDefault(c, 0) + 1);
                if (st.get(c).equals(targetMap.get(c))) count++;
            }
            
            while(count == targetMap.size()){
               int len=end-start+1;
               if(len<min){
                min=len;
                res=s.substring(start,end+1);
               }
                char startChar = s.charAt(start);
                if(targetMap.containsKey(startChar)){
                    if (st.get(startChar).equals(targetMap.get(startChar))) count--;
                    st.put(startChar, st.get(startChar) - 1);
                }
                start++;
            }
            end++;
        }
        return res;
    }
}