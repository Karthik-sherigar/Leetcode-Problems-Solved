class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];
        int evenCount=0;
        int oddCount = 0;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]<min){
                min=nums1[i];
            }if(nums1[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        if(evenCount==nums1.length || oddCount==nums1.length){
            return true;
        }
        if(min%2!=0){
            return true;
        }
        return false;
    }
}