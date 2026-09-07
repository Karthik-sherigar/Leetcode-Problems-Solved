class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>s.length()){
            return s;
        }
        StringBuilder[] r = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            r[i] = new StringBuilder();
        }
        int j=0;
        int d = 1;
        for(int i=0; i<s.length(); i++){
            r[j].append(s.charAt(i));
            if(j==0){
                d=1;
            }
            if(j==numRows-1){
                d = -1;
            }
            j=j+d;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i<numRows; i++){
            res.append(r[i]);
        }
        return res.toString();
    }
}