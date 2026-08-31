class Solution {
    public int hammingWeight(int n) {
         String bits = Integer.toBinaryString(n);
        int res = 0;
        for (int i = 0; i < bits.length(); i++) {
            res+=bits.charAt(i)-'0';
        }
        return res;
    }
}