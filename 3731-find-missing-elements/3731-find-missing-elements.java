class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> ans = new ArrayList<>();
        int min=nums[0];
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        Arrays.sort(nums);
        int j=0;
        for(int i = min; i<max; i++){
            if(i==nums[j]){
                j++;
            }else{
                ans.add(i);
            }
        }
        return ans;
        
    }
}