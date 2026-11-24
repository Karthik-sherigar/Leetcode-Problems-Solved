class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap();
        for(int i = 0; i<names.length; i++){
            map.put(heights[i], names[i]);
        }
        String[] res = new String[names.length];
        int j = 0;

        for(int i = 0; i<names.length; i++){
            int max = Collections.max(map.keySet());
            res[i] = map.get(max);
            map.remove(max);
            j++;
        }
        return res;

    }
}