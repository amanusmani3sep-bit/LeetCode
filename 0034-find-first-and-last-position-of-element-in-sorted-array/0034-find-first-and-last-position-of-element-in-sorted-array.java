class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=bin1(nums,target);
        int j=bin2(nums,target);
        int[] a={i,j};
        return a;

    }
    static int  bin1(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int mid=0;
        int ind=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target){
                 ind=mid;
                e=mid-1;
            }
            if(nums[mid]>target){
                 e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
        }
        return ind;
    }
    static int  bin2(int[] nums,int target){
        int s=0;
        int e=nums.length-1;
        int mid=0;
        int ind=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target){
                 ind=mid;
                s=mid+1;
            }
            if(nums[mid]>target){
                 e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
        }
        return ind;
    }
}