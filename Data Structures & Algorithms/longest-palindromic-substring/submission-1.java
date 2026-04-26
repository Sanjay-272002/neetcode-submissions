class Solution {
    public String longestPalindrome(String s) {
        int index=0;
        int max=0;
        String res="";
        while(index<s.length()){
            int left=index;
            int right=index;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            left++;
            right--;
            int len=right-left+1;
            if(len>max){
                max=len;
                res=s.substring(left,right+1);
            }
             left=index;
             right=index+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            left++;
            right--;
             len=right-left+1;
            if(len>max){
                max=len;
                res=s.substring(left,right+1);
            }
            index++;
        }
        return res;
    }
}
