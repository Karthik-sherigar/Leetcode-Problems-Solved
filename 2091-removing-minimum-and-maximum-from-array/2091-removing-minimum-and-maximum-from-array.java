class Solution {
    public int minimumDeletions(int[] nums) {
        int minI = 0;
        int maxI = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<nums[minI]){
                minI = i;
            }
            if(nums[i]>nums[maxI]){
                maxI=i;
            }
        }
        int left = Math.min(maxI, minI);
        int right = Math.max(maxI, minI);
        int front = right+1;
        int back = nums.length-left;
        int bothSide = (left+1)+(nums.length-right);
        return Math.min(front, Math.min(back,bothSide));
    }
}