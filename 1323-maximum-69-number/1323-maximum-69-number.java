class Solution {
    public int maximum69Number (int num) {
        String nums = Integer.toString(num);
        StringBuilder sb = new StringBuilder(nums);
        for(int i = 0; i<sb.length(); i++){
           if(sb.charAt(i)=='6'){
            sb.setCharAt(i, '9');
            break;
           }
        }
        int res = Integer.parseInt(sb.toString());
        return res;
    }
}