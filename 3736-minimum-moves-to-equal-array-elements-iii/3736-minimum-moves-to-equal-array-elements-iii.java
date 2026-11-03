class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int max = 0;
        for(int i:nums){
            max = Math.max(max, i);
        }
        for(int i = 0; i<nums.length; i++){
            sum+=max-nums[i];
        }
        return sum;
    }
}