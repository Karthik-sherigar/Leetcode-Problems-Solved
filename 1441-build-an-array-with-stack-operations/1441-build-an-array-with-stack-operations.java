class Solution {
    public List<String> buildArray(int[] target, int n) {
        int j = 0;
        List<String> result = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(j==target.length){
                return result;
            }else if(target[j] == i){
                result.add("Push");
                j++;
            }else{
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }
}