class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int count = 1;
        int aCount = 0;
        int bCount = 0;
        int r = 10;
        while(n>=r){
            n-=r;
            if(count%2!=0){
                aCount++;
            }else{
                bCount++;
            }
            r--;
            count++;
        }
        
        return aCount>bCount;
    }
}