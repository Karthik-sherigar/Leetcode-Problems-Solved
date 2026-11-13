class Solution {
    public int dayOfYear(String date) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String month = date.substring(5,7);
        int m = Integer.parseInt(month);
        String day = date.substring(8);
        int d = Integer.parseInt(day);
        String year = date.substring(0, 4);
        int y = Integer.parseInt(year);
        int res = 0;
        for(int i = 0; i<m-1; i++){
            res+=days[i];
        }
        res+=d;
        if(m>2){
            if(y%400==0 || (y%4==0 && y%100!=0)){
            return res+1;
        }
        }
        return res;
    }
}