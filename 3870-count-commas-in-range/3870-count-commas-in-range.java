class Solution {
    public int countCommas(int n) {
        if(n>999 && n<100000){
            return (n-1000)+1;
        }else if(n==100000){
            return 99000+1;
        }else{
            return 0;
        }
    }
}