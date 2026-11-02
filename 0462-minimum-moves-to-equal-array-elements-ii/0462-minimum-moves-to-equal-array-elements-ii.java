class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int med = nums[nums.length/2];
        for(int i: nums){
            sum=sum+Math.abs(med-i);
        }
        return sum;
    }
}