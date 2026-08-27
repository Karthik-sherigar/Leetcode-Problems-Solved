class Solution {
    public String countAndSay(int n) {
        String current = "1";
        for(int i=2; i<=n; i++){
            StringBuilder sb = new StringBuilder();
            int j=0;
            while(j<current.length()){
                char c = current.charAt(j);
                int count = 0;
                while(j<current.length() && current.charAt(j)==c){
                    count++;
                    j++;
                }
                sb.append(count);
                sb.append(c);
            }
            current = sb.toString();
        }
        return current;
    }
}