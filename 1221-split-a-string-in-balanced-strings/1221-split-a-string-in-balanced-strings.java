class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int rcount = 0;
        int lcount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                lcount++;
            }
            if(s.charAt(i)=='R'){
                rcount++;
            }
            if(rcount==lcount){
                count++;
                rcount = 0;
                lcount = 0;
            }
        }
        return count;
    }
}