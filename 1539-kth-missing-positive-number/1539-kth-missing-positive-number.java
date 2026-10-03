class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = 1;
        while(k>0){
            boolean flag = false;
            for(int i=0; i<arr.length; i++){
                if(arr[i] == n){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                k--;
            }
            n++;
        }
        return n-1;

    }
}