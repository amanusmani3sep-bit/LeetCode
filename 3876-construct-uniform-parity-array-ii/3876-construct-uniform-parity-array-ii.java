class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int i=1; 
        int j=0;
        if(nums1[j]%2==0){
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
