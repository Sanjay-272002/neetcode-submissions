class Solution {
    public int lastStoneWeight(int[] stones) {
        int max=0;
        for(int stone :stones){
            max=Math.max(max,stone);
        }
        int [] arr=new int[max+1];
        for(int stone :stones){
            arr[stone]++;
        }
        int first=max,second=max;
        while(first>0){
            if(arr[first]%2==0){
                first--;
                continue;
            }

            int j=Math.min(first-1,second);
            while(j>0 && arr[j]==0) j--;
            if(j==0) return first;
            second=j;
            arr[second]--;
            arr[first]--;
            arr[first-second]++;
            first=Math.max(first-second,second);
        }
        return first;
    }
}
