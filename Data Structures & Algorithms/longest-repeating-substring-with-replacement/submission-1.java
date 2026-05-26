class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> store=new HashMap<>();
        int maxFreq=0;
        int res=0;
        int len=0;
        int st=0,end=0;

        while(end<s.length()){
            store.put(s.charAt(end),store.getOrDefault(s.charAt(end),0)+1);
            maxFreq=Math.max(maxFreq,store.get(s.charAt(end)));
            len=end-st+1;
            if(len-maxFreq<=k){
                res=Math.max(res,len);
            }else{
               store.put(s.charAt(st),store.getOrDefault(s.charAt(st),0)-1); 
               st++;
            }
            end++;
        }

    return res;
    }
}
