class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int k=0;
        int fsum=0;
        int min=Integer.MAX_VALUE;
        while(i<nums.length-2){
           j=i+1;
           k=nums.length-1;
           while(j<k && k>i && j<nums.length){
             int sum=nums[i]+nums[j]+nums[k];
             int sum2=nums[i]+nums[j]+nums[k]-target;
             if(min!=Math.abs(sum2) && Math.abs(sum2)<min ){
                      min=Math.abs(sum2);
                      fsum=sum;
             }
             if(sum<target){
                j+=1;
             }
             else if(sum>target){
                k-=1;
             }
             else{
                j+=1;
                k-=1;
             }

           }
           i+=1;
        }

        return fsum;
    }
}