class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int left = 0;
        int maxFre = 0;
        int fre[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            fre[s.charAt(i)-'A']++;
            maxFre = Math.max(maxFre, fre[s.charAt(i)-'A']);
            while((i-left+1)-maxFre>k){
                fre[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}