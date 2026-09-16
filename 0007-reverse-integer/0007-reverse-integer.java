class Solution {
    public int reverse(int n) {
        int sum=0;
        while(n!=0){
            int r = n%10;
            if(sum>Integer.MAX_VALUE/10 || (sum==Integer.MAX_VALUE/10 && r>7)){
                return 0;
            }
            if(sum<Integer.MIN_VALUE/10 || (sum==Integer.MIN_VALUE/10 && r<-8)){
                return 0;
            }
            sum=sum*10+r;
            
            n/=10;
        }
        return sum;
    }
}