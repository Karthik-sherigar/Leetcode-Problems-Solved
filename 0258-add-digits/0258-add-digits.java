class Solution {
    public int addDigits(int num) {
        int digit=0;
        int sum = 0;
        while(num!=0){
           sum = 0;
            while(num!=0){
            int r = num%10;
            sum+=r;
            digit++;
            num/=10;
            }
            if(digit!=1){
                num=sum;
                digit = 0;
            }
        }
      
          if (digit==1){
            return sum;
          }
        return 0;
    }
}