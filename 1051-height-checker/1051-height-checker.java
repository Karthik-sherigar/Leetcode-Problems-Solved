class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = new int[heights.length];
        int j = 0;
        for(int i: heights){
            expected[j] = i;
            j++;
        }
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i<heights.length; i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}