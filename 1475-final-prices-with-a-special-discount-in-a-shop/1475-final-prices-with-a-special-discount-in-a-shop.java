class Solution {
    public int[] finalPrices(int[] nums) {
        int i=0;
        int j=1;
        // while(j>i  && i<nums.length && j<nums.length){
        //     if(nums[j]<nums[i]){
        //         nums[i]=nums[i]-nums[j];
        //     }
        //     else{
        //      while( j<nums.length && nums[j]>nums[i] ){
        //         j+=1;
        //     }
        //     i+=1;
            
        // }
        while(i<nums.length){
            j=i+1;
            while(j<nums.length && nums[j]>nums[i]){
                j+=1;
            }
            if(j!=nums.length){
                nums[i]=nums[i]-nums[j];
            }
            i+=1;
        }
        
        return nums;
    }
}