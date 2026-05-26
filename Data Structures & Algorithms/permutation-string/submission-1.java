class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int [] count1=new int[26];
        int [] count2=new int[26];

        int match=0;
        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(count1[i]==count2[i]) match++;
        }
         int index=0,st=0;
        for(int i=s1.length();i<s2.length();i++){
            if(match==26) return true;
             index=s2.charAt(i)-'a';
            count2[index]++;
            if(count1[index]==count2[index]) match++;
            if(count1[index]+1==count2[index])match--;
            
            index=s2.charAt(st++)-'a';
            count2[index]--;
            if(count1[index]==count2[index]) match++;
            if(count1[index]-1==count2[index])match--;
        }

        return match==26;
    }
}
