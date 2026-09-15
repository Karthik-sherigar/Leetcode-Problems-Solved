class Solution {
    public int numberOfChild(int n, int k) {
         int count = 0;
        int flag = 0;
        for(int i=1; i<=k; i++){
            if(count==0){
                flag=0;
            }
            if(count==n-1){
                flag=1;
            }
            if(flag==0){
                count++;
            }else if(flag==1){
                count--;
            }
        }
        return count;
    }
}