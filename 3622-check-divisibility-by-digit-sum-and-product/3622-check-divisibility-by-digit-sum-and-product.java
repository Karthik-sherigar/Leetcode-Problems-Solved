class Solution {
    public static boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int val = n;
        while(n!=0){
            int r = n%10;
            sum+=r;
            product=product*+r;
            n=n/10;
        }
     return val%(sum+product) == 0;
    }
}