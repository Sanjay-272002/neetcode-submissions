class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int have=need.size(),l=0,count=0,len=Integer.MAX_VALUE;
        int [] res={-1,-1};
        for(int r=0;r<s.length();r++){
            char cur=s.charAt(r);
            window.put(cur,window.getOrDefault(cur,0)+1);
            if(need.containsKey(cur) && need.get(cur)==window.get(cur) ) count++;

            while(count==have){
                int curlen=r-l+1;
                if(curlen<len){
                len=curlen;
                res[0]=l;
                res[1]=r;
                }
                char start=s.charAt(l);
                if(need.containsKey(start) && need.get(start)==window.get(start)) count--;

                window.put(start,window.getOrDefault(start,0)-1);
                l++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
