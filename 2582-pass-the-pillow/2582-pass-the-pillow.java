class Solution {
    public int passThePillow(int n, int time) {
        int count = 1;
        int flag = 0;
        for(int i=1; i<=time; i++){
            if(count==1){
                flag=0;
            }
            if(count==n){
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