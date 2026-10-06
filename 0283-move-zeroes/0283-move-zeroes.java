class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<j && j<nums.length){
                if(nums[i]==0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                if(nums[i]!=0){
                    i+=1;
                }
                j+=1;
        }
    }
}