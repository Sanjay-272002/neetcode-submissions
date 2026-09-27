class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int len=Math.min(word1.length(),word2.length());
        int i=0;
        for( ;i<len;i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        if(i<word1.length())str.append(word1.substring(i));
        if(i<word2.length())str.append(word2.substring(i));

        return str.toString();
    }
}