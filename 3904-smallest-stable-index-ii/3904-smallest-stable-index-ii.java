class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        int[] map1=new int[nums.length];
        int[] map2=new int[nums.length];
        // HashMap<Integer,Integer> map1=new HashMap<>();
        // HashMap<Integer,Integer> map2=new HashMap<>();
        for (int i=0;i<nums.length;i++){
             if(nums[i]>maxi){
                maxi=nums[i];
             }
             map1[i]=maxi;
        }
        for (int i=nums.length-1;i>=0;i--){
             if(nums[i]<mini){
                mini=nums[i];
             }
             map2[i]=mini;
        }
        for(int i=0;i<nums.length;i++){
            if((map1[i]-map2[i])<=k){
                return i;
            }
        }
        return -1;
    }
}