class Solution {
    public int minOperations(int[] nums, int x) {
        int numSum = 0;
        for(int i: nums){
            numSum+=i;
        }
        int tar = numSum-x;
        if(tar<0){
            return -1;
        }
        if(tar==0){
            return nums.length;
        }
        int l = 0;
        int maxLen = -1;
        int sum=0;
        for(int r=0; r<nums.length; r++){
            sum+=nums[r];
            while(sum>tar){
                sum-=nums[l];
                l++;
            }
            if(sum==tar){
                maxLen = Math.max(maxLen, (r-l)+1);
            }
            
        }
        if(maxLen==-1){
            return -1;
        }
        return nums.length-maxLen;
    }
}