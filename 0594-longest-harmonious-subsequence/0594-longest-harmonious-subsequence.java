class Solution {
    public int findLHS(int[] nums) {
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(map.containsKey(entry.getKey()+1)){
                maxLen = Math.max(maxLen, (entry.getValue()+map.get(entry.getKey()+1)));
            }
        }
        return maxLen;
    }
}