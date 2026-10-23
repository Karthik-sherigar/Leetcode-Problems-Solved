class Solution {
    public int sortPermutation(int[] nums) {
        int res = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=i){
                res = res&nums[i];
            }
        }
        int result = Math.max(res, 0);
        return result;
    }
}