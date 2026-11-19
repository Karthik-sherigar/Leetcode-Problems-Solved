class Solution {
    public int absDifference(int[] nums, int k) {
        int desc[] = new int[nums.length];
        Arrays.sort(nums);
        int j=0;
        for(int i = nums.length-1; i>=0; i--){
            desc[j] = nums[i];
            j++;
        }
        int max = 0;
        int min = 0;

        for(int i = 0; i<k; i++){
            max+=desc[i];
            min+=nums[i];

        }
        return Math.abs(max-min);
    }
}