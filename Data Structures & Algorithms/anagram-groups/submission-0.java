class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> store=new HashMap<>();
        for(String s:strs){
            char [] arr=s.toCharArray();
            Arrays.sort(arr);
            String st=new String(arr);
            if(!store.containsKey(st)){
            store.put(st,new ArrayList<>());
            }
            store.get(st).add(s);
        }

        return new ArrayList<>(store.values());
    }
}
