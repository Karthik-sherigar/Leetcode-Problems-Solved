class Solution {
    public boolean isPalindrome(String s) {
        String res = "";
     s= s.toLowerCase();
      for(int i = 0; i<s.length(); i++) {
    	  if(Character.isLetterOrDigit(s.charAt(i))) {
    		  res+=s.charAt(i);
    	  }
      }
      
      StringBuilder sb = new StringBuilder(res);
      String result = sb.reverse().toString();
      return result.equals(res);

    }
}