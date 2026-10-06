class Solution {
    public boolean isMonotonic(int[] nums) {
        if(asc(nums) || desc(nums)){
            return true;
        }
        
        return false;
    }
    static boolean asc(int[] nums){
        for(int i=0;i<nums.length-1;i++){
               if(nums[i]>nums[i+1]){
                return false;
               }
        }
        return true;
    }
    static boolean desc(int[] nums){
        for(int i=1;i<nums.length;i++){
               if(nums[i]>nums[i-1]){
                return false;
               }
        }
        return true;
    }
}