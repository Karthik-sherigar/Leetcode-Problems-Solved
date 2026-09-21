class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r = s.length()-1;
        
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return (palindrom(s, l, r-1) || palindrom(s,l+1,r));
            }
            l++;
            r--;
            
        }
        return true;
    }
    public boolean palindrom(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            r--;
            l++;
           
        }
         return true;
    }
}