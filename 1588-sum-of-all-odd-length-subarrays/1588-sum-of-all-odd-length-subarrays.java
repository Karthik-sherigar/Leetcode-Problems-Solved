class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int oddSum = 0;
        
        for(int i = 0; i<arr.length; i++){
            
            for(int j = i; j<arr.length; j++){
                int len = 0;
                int sum = 0;
                for(int k = i; k<=j; k++){
                    len ++;
                    sum+=arr[k];
                }
                if(len%2!=0){
                    oddSum+=sum;
                }
            }
        }
        return oddSum;
    }
}