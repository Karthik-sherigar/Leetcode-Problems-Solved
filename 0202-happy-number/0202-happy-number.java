class Solution {
    public boolean isHappy(int n) {
     while(n!=1){
        int sum=0;
        while(n>0){
            int r = n%10;
            sum+=r*r;
            n/=10;
        }
        n=sum;
        if(n==4){
            return false;
        }
            
    }
    return n==1;
    }
}