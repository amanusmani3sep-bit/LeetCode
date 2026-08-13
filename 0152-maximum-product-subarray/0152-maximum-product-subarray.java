class Solution {
    public int maxProduct(int[] nums) {
        int i=0;
        int j=i+1;
        int product=1;
        int max=Integer.MIN_VALUE;
        while(i<nums.length){
            product=1;
            j=i;
            while(j<nums.length){
                product=product*nums[j];
                j+=1;
               if(max<product){
                max=product;
               }
            }
            i+=1;
        }

        if(max!=-2147483648){

        return max;
        }
        return product;
    }
}