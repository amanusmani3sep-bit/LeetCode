class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1 ){
            if(nums[0]==target){
                return 0;
            }
            else{
                return -1;
            }
        }
        int i=pivot(nums);
        if(i==-1){
            return bs(nums,0,nums.length-1,target);
        }
        else if(target>=nums[0]){
            return bs(nums,0,i,target);
        }
        else {

           return  bs(nums,i+1,nums.length-1,target);
        }
       
    }
    public int pivot(int[] nums){
        int i=0;
        int j=nums.length-1;
        int mid=0;
        while(i<=j){
            mid=i+(j-i)/2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<nums[0]){
                j=j-1;
            }
            else{
                i+=1;
                }
            
        }
        return -1;
        
    }
    public int bs(int[] nums,int i,int j,int target){
        int s=i;
        int e=j;
        int mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}