class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n/2;

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ=0;

        for(int i=0; i<n; i++){
            if(i<half){
                if(num.charAt(i)=='?'){
                    leftQ++;
                }else{
                    leftSum=leftSum+num.charAt(i)-'0';
                }
            }
                else{
                    if(num.charAt(i)=='?'){
                    rightQ++;
                }else{
                    rightSum=rightSum+num.charAt(i)-'0';
                }
                }
            
        }
        int sumDiff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        return 2 * sumDiff + 9 * qDiff != 0;
    }
}