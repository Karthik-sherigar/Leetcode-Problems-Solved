class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int suf[] = new int[nums.length];
        suf[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            suf[i] = Math.min(nums[i], suf[i+1]);
        }
        int pref = nums[0];
        for(int i=0; i<nums.length; i++){
            pref = Math.max(nums[i], pref);
            if(pref-suf[i]<=k){
                return i;
            }
        }
        return -1;
    }
}