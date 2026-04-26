class Solution {
    public int characterReplacement(String s, int k) {
        int start=0,end=0,max=0,res=0;
        HashMap<Character,Integer> st=new HashMap<>();
    int n=s.length();
    while(end<n){
        st.put(s.charAt(end),st.getOrDefault(s.charAt(end),0)+1);
        max=Math.max(max,st.get(s.charAt(end)));
        int currlen=end-start+1;
        if(currlen-max<=k){
            res=Math.max(res,currlen);
        }else{
            st.put(s.charAt(start),st.get(s.charAt(start))-1);
            start++;
        }

        end++;
    }
       return res;
    }
}
