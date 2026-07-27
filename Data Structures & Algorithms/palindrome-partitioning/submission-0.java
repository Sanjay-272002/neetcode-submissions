class Solution {
    public List<List<String>> partition(String s) {
        return formPartition(s,new ArrayList<>(),0);
    }

    List<List<String>> formPartition(String s,List<String> path,int start){
        List<List<String>> res=new ArrayList<>();
        if(start==s.length()){
            res.add(new ArrayList<>(path));
            return res;
        }

        for(int i=start;i<s.length();i++){
            if(isPalindrome(s,start,i)){
            path.add(s.substring(start,i+1));
            res.addAll(formPartition(s,path,i+1));
            path.remove(path.size()-1);
            }
        }

        return res;
    }

    boolean isPalindrome(String s,int start,int end){
        
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}
