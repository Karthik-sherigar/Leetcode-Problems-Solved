class Solution {
    public int[] findErrorNums(int[] nums) {
      int n = nums.length;
        boolean visited[] = new boolean[n+1];
        int duplicate = -1 ;
        int missing = -1;

        for(int num: nums){
            if(visited[num]){
                duplicate = num;
            }else {
                visited[num] = true;
            }
        }

        for(int i = 1; i<=n; i++){
            if(!visited[i]){
                missing = i;
                break;
            }
        }
        return new int[] {duplicate, missing};
    }
}