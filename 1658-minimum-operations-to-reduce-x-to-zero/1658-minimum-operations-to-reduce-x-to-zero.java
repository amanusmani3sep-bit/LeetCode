class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int target=sum-x;
        if(target<0){
            return -1;
        }
        // int i=0;
        int j=0;
        sum=0;
        int max=-1;
        for(int i=0;i<nums.length;i++){
              sum=sum+nums[i];
              while(sum>target && j<nums.length){
                 sum=sum-nums[j];
                 j+=1;
              }
              if(sum==target){
                 max=Math.max(max,i-j+1);
              }
        }
        if(max!=-1){
            return nums.length-max;
        }
        return max;
    }
}