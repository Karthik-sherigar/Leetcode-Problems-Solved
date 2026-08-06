class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; ; i++){
            int product = 1;
            int val = i;
            while(val!=0){
                int r = val%10;
                product *= r;
                val /= 10;
            }
            if(product % t ==0){
                return i;
            }
        }
    }
}