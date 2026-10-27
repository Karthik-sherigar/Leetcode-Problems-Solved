class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int n = 0;
        int maxLength = 0;
        for(int i = 0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(n));
                n++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(set.size(), maxLength);
        }
        return maxLength;
    }
}