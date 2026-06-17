class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        int [] min=new int[2];
        int minLen=Integer.MAX_VALUE;
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char cur=t.charAt(i);
            hm.put(cur,hm.getOrDefault(cur,0)+1);
        }
        int need=hm.size();
         int have=0,l=0,end=0;
        
        while(end<s.length()){
         char cur=s.charAt(end);
         window.put(cur,window.getOrDefault(cur,0)+1);
         if(hm.containsKey(cur) && hm.get(cur)==window.get(cur)) have++;

         while(have==need){
            int len=end-l+1;
            if(len<minLen){
                minLen=len;
                min[0]=l;
                min[1]=end;
            }
            char start=s.charAt(l);
            if(hm.containsKey(start) && hm.get(start)==window.get(start)) have--;
            window.put(start,window.get(start)-1);
            l++;
         }     
         end++;
        }
        return minLen==Integer.MAX_VALUE?"": s.substring(min[0],min[1]+1);
    }
}
