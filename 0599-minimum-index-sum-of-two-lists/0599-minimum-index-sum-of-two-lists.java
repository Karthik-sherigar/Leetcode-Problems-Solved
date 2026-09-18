class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i].equals(list2[j])){
                    hm.put(list1[i], i+j);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int value: hm.values()){
            if(value<min){
                min=value;
            }
        }
        int count=0;
        for(int value:hm.values()){
            if(value==min){
                count++;
            }
        }
        String ans[] = new String[count];
        int k=0;
        for(String key: hm.keySet()){
            if(hm.get(key)==min){
                ans[k] = key;
                k++;
            }
        }
        return ans;
    }
}