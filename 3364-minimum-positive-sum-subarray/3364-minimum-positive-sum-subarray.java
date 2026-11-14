class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for(int i =0; i<nums.size(); i++){
            for(int j=i; j<nums.size(); j++){
                int sum = 0;
                List<Integer> res = new ArrayList();
                for(int k = i; k<=j; k++){
                    sum+=nums.get(k);
                    res.add(nums.get(i));
                }
                if(sum>0){
                    int n = res.size();
                    if(n>=l && n<=r){
                        ans = Math.min(ans, sum);
                    }
                }
            }
        }
        if(ans == Integer.MAX_VALUE) ans = -1;
        return ans;
    }
}