class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> hs = new ArrayList<>();
        for(char i: s.toCharArray()){
            hs.add(i);
        }
      
        for(char i:t.toCharArray()){
            if(hs.contains(i)){
                hs.remove((Character)i);
            }else{
                return i;
            }
        }
        return ' ';
    }
}