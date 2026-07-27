class Solution {
    
    private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        StringBuilder sb=new StringBuilder();
        return backTrack(digits,0,sb);
    }
    List<String> backTrack(String digits,int index,StringBuilder sb){
         List<String> res=new ArrayList<>();
        if(index==digits.length()){
            if(sb.length()==0) return res;
           res.add(sb.toString());
           return res;
        }

        String s=digitToChar[digits.charAt(index)-'0'];
        for(char c: s.toCharArray()){
            sb.append(c);
            res.addAll(backTrack(digits,index+1,sb));
            sb.deleteCharAt(sb.length() - 1);
        }
        return res;
    }

}
