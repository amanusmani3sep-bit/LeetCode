class Solution {
    public int longestSubsequence(int[] nums) {
        int i=0;
        int n=0;
        int j=0;
        int maxl=Integer.MIN_VALUE;
        while(i<nums.length){
            n=n^nums[i];
            i+=1;
        }
         if(n!=0){
                  maxl=nums.length;
                
         }
        else{
            for(j=0;j<nums.length;j++){
                n=n^nums[j];
                if(n!=0){
                  maxl=nums.length-1;
                  break;
                }
                else{
                      n=n^nums[j];
                }
          }
          

        }
        // while(n<=0 && j<nums.length){
        //        n=n^nums[j];
        //        j+=1;
        //        if(n!=0){
        //         maxl=Math.max(maxl,i-j);
        //        }
        // }
            // maxl=Math.max(maxl,i-j+1);
        if(maxl==-2147483648){
            return 0;
        }
        return maxl;
    }
}