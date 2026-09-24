class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==check(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public int check(int i){
        int sum=0;
        int rem=0;
        if(i<10){
            return i;
        }
        else{
            while(i>0){
                rem=i%10;
                sum=sum+rem;
                i=i/10;
            }
            return sum;
        }

    } 
}