class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];

    for (int i = 1; i < nums1.length; i++) {
       min = Math.min(min, nums1[i]);
     }
        int i=0; 
        int j=0;
        if(min%2==0){
            while(i<nums1.length && j<nums1.length){
                if(nums1[i]%2!=0){
                    return false;
                }
                i+=1;
          }
        }
        
        return true;
        }
    }
