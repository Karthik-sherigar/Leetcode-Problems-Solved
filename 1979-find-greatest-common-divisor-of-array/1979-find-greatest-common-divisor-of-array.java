class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
      for(int i = 0; i<nums.length; i++){
        max = Math.max(nums[i], max);
        min = Math.min(nums[i], min);
      }  
      while(max!=0 && min!=0){
        if(max>min){
            max = max%min;
        }else{
            min = min%max;
        }
      }
      if(min!=0) return min;
      return max;
    }
}