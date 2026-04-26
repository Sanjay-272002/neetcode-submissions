class Solution {
   public int countSubstrings(String s) {
        
        int index=0;
        int res=0;
        while(index<s.length()){
            res+=helper(s,index,index);
            res+=helper(s,index,index+1);
            index++;
        }
        return res;
    }
    int helper(String s,int st,int en){
        int res=0;
        while(st>=0 && en<s.length() && s.charAt(st)==s.charAt(en)){
            res++;
            st--;
            en++;
        }
        return res;
    }


}
