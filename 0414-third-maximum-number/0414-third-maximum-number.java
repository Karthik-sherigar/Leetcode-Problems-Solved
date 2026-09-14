class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirMax = Long.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==max || nums[i]==secMax || nums[i] == thirMax){
                continue;
            }
         if(nums[i]>max){
                thirMax = secMax;
                secMax = max;
                max = nums[i];
            }
           else if(nums[i]>secMax){
                thirMax = secMax;
                secMax = nums[i];
            }
            else if(nums[i]>thirMax){
                thirMax = nums[i];
            }
        }
        if(thirMax==Long.MIN_VALUE){
            return (int) max;
        }

        return (int) thirMax;
    }
}