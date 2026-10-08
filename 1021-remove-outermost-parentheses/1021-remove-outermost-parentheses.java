class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(count!=0){
                    res+=ch;
                }
                count++;
            }else{
                count--;
                if(count!=0){
                    res+=ch;
                }
            }
        }
        return res;
    }
}