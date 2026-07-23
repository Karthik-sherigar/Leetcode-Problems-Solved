class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] ans = new int[nums.length];
        int a1n = 0;
        int a2n = 0;

        for(int i = 0; i<n; i++){
            arr1[i] = nums[i];
            arr2[i] = nums[n+i];
        }

        for(int i = 0; i<nums.length; i++){
            if((i+1)%2!=0){
                ans[i] = arr1[a1n];
                a1n++;
            }else{
                ans[i] = arr2[a2n];
                a2n++;
            }
        }
        return ans;

    }
}