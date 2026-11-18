class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        int prod = 0;
        for(int i = 0; i<s.length(); i++){
            int product = 0;
            for(int j = i+1; j<s.length(); j++){
                product = (s.charAt(i)-'0') * (s.charAt(j)-'0');
                if(product>prod){
                prod = product;
            }
            }
            
        }
        return prod;
    }
}