class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int end=0;
        while(end<tokens.length){    
                int res=0;
                if(tokens[end].equals("*")){
                    int val2=st.pop();
                int val1=st.pop();
                  res=val1*val2;
                   st.push(res);
                }else if(tokens[end].equals("+")){
                    int val2=st.pop();
                int val1=st.pop();
                    res=val1+val2;
                     st.push(res);
                }else if(tokens[end].equals("-")){
                    int val2=st.pop();
                int val1=st.pop();
                    res=val1-val2;
                     st.push(res);
                }else if(tokens[end].equals("/")){
                    int val2=st.pop();
                    int val1=st.pop();
                    res=val1/val2;
                     st.push(res);
                }else{
                    st.push(Integer.parseInt(tokens[end])); 
                }
                 end++;
            }
          
        
        return st.pop();
    }
}
