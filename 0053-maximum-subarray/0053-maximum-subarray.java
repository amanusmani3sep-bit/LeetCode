class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int smax=Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            sum=sum+nums[i];
            smax=Math.max(sum,smax);
            if(sum<0){
              sum=0;

            }
        }
        return smax;
    }
}