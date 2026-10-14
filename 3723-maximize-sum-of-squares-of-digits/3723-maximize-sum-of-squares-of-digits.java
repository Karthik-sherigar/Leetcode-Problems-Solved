class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum){
            return "";
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i<num; i++){
            if(sum>=9){
                res.append(9);
                sum-=9;
            }else{
                res.append(sum);
                sum = 0;
            }
        }
        return res.toString();
    }
}