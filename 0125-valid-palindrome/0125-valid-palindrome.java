class Solution {
    public boolean isPalindrome(String s) {
        String res = "";
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res+=s.charAt(i)+"";
            }
        }
        res = res.toLowerCase();
        StringBuilder sb = new StringBuilder(res);
        String r = sb.reverse().toString();

        if(res.equals(r)){
            return true;
        }
        else return false;

    }
}