class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = lowLimit; i<=highLimit; i++){
            int sum = 0;
            int m = i;
            while(m!=0){
                int r = m%10;
                sum+=r;
                m/=10;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(max<entry.getValue()){
                max = entry.getValue();
            }
        }
        return max;
    }
}