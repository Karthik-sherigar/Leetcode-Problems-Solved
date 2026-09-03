class Solution {
    public String mergeAlternately(String word1, String word2) {
        String c = "";
        int i = 0;
        int j = 0;
        int alt = 0;

        while(i<word1.length() && j<word2.length()){
            if(alt==0){
                c = c+word1.charAt(i);
                i++;
                alt = 1;
            }
            if(alt==1){
                c=c+word2.charAt(j);
                j++;
                alt = 0;
            }
        }
        while(i<word1.length()){
            c=c+word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            c=c+word2.charAt(j);
            j++;
        }
        return c;
    }
}