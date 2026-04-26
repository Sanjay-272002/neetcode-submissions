class Solution {
    public boolean isValid(String s) {
        Stack<Character> store=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')store.push(s.charAt(i));
            else if(store.isEmpty() && (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')) return false;
            else if(!store.isEmpty() && (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')){
                char c=s.charAt(i);
                char top=store.pop();
                if(c==')' && top!='(') return false;
                if(c==']' && top!='[') return false;
                if(c=='}' && top!='{') return false;
            }
        }
        if(!store.isEmpty()) return false;
        return true;
    }
}
