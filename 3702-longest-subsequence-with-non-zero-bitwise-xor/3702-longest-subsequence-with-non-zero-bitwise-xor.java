class Solution {
    public int longestSubsequence(int[] nums) {
        int i=0;
        int n=0;
        int j=0;
        int maxl=0;
        while(i<nums.length){
            n=n^nums[i];
            i+=1;
        }
        if(n!=0){
                 return  maxl=nums.length;
                
        }
        for(j=0;j<nums.length;j++){
            if((n^nums[j])!=0){
                  maxl=nums.length-1;
                  break;
                }
          }
          

        
        return maxl;
    }
}