class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        HashSet<Integer> sub = new HashSet();
        for(int i = 0; i<nums.size(); i++){
            for(int j=i; j<nums.size(); j++){
                sub.clear();
                for(int k=i; k<j+1; k++){
                     sub.add(nums.get(k));
                }
                int len = sub.size();
                sum=sum+(len*len);
            }
            
        }
        return sum;
    }
}