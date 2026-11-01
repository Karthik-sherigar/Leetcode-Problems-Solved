class Solution {
    public int maxPower(String s) {
        char[] c = s.toCharArray();
        int max = 1;
        int count = 1;
        for(int i = 0; i<c.length-1; i++){
            if(c[i]==c[i+1]){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}