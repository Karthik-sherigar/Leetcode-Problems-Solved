class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap();
        String a[] = s1.split(" ");
        String b[] = s2.split(" ");
        List<String> list = new ArrayList();
        for(int i = 0;i<a.length; i++ ){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        for(int i = 0;i<b.length; i++ ){
            map.put(b[i], map.getOrDefault(b[i], 0)+1);
        }
       for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
       }
       String[] res = list.toArray(new String[0]);
       return res;
    }
}