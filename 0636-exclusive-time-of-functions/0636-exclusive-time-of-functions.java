class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        int lastTime = 0;
        for(String log: logs){
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String status = parts[1];
            int timeStamp = Integer.parseInt(parts[2]);

            if(status.equals("start")){
                if(!stack.isEmpty()){
                    ans[stack.peek()] += timeStamp - lastTime;
                    lastTime = timeStamp;

                }
                    stack.push(id);
                    lastTime = timeStamp;
                
            }
            else{
                ans[stack.pop()] += timeStamp - lastTime+1;
                lastTime = timeStamp+1;
            }
        }
        return ans;
    }
}