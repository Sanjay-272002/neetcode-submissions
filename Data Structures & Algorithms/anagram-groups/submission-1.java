class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String st=new String(arr);
            if(!hm.containsKey(st)){
                hm.put(st,new ArrayList<>());
            }
              hm.get(st).add(s);
        }

        return new ArrayList<>(hm.values());

    }
}
