class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minst;
    public MinStack() {
        this.st=new Stack<>();
        this.minst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(!minst.isEmpty())
        val=Math.min(val,minst.peek());
        minst.push(val);
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
      return  st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}
