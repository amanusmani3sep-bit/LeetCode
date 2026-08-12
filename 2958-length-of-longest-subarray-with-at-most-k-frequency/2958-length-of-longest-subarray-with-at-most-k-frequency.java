class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        int maxl=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k && j<=i){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0){
                    map.remove(nums[j]);
                }
                j+=1;
            }
            if(i-j+1>maxl){
                maxl=i-j+1;
            }
            
        }
        return maxl;
    }
}