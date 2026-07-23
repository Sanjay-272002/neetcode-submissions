class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freq=new int[26];
        for(char c : tasks){
          freq[c-'A']++;
        }
        Arrays.sort(freq);
        int maxf=freq[25];
        int idle=(maxf-1)*n;
        for(int i=24;i>=0;i--){
            idle-=Math.min(freq[i],maxf-1);
        }

        return tasks.length+Math.max(0,idle);
    }
}
