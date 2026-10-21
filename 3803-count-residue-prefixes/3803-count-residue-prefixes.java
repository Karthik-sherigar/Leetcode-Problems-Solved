class Solution {
    public int residuePrefixes(String s) {
        Set<Character> set = new HashSet();
       int count = 0;
        for(int i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
            int n = (i+1)%3;
            if(set.size() == n){
                count++;
            }
        }
        return count;
    }
}