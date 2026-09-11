class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> l = new LinkedList();
        for(char i: s.toCharArray()){
            if(i=='(' || i=='[' || i=='{'){
                l.addLast(i);
            }
            else if(l.size()!=0 && i==')' && l.peekLast()=='(' || l.size()!=0 && i=='}' && l.peekLast()=='{' || l.size()!=0 && i==']' && l.peekLast()=='[' ){
                l.removeLast();
            }
            else {
                return false;
            }
        }
        return l.isEmpty();
    }
}