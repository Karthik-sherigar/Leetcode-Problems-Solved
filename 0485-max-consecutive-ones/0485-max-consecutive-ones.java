class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int newCount = 0;
        int count = 0;
        int perCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count ++;
                if(count>perCount){
                    perCount = count;
                }

            }else{
                count=0;
            }
        }
        return perCount;
    }
}