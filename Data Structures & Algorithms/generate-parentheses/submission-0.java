class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        return Result(0,0,n,sb);
    }

    List<String> Result(int openN,int closeN,int n,StringBuilder sb){
        List<String> res=new ArrayList<>();
        if(openN==n & closeN==n){
            res.add(sb.toString());
            return res;
        }

        if(openN<n){
            sb.append('(');
            res.addAll(Result(openN+1,closeN,n,sb));
            sb.deleteCharAt(sb.length()-1);
        }

        if(closeN < openN){
            sb.append(')');
            res.addAll(Result(openN,closeN+1,n,sb));
            sb.deleteCharAt(sb.length()-1);
        }

        return res;
    }
}
