class Solution {
    public String digitSum(String s, int k) {
       int m = k;
       
       while(s.length()>k){
        String res = "";
        for(int i = 0; i < s.length(); i += m) {
            String grp = s.substring(i, Math.min(i + m, s.length()));
            int sum = 0;
            for(int j = 0; j<grp.length(); j++){
                sum = sum+grp.charAt(j)-'0';
            }
            res+=sum;
        }
         s = res;
       }
        return s;
    }
}