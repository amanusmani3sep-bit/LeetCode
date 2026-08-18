class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxn=-1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           System.out.println(nums[i] + " " + map.get(nums[i]));
          }
        if(k==1){
          for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                maxn=Math.max(maxn,nums[i]);
                System.out.println(maxn);
            }
          }
            return maxn;
        }
        else if(k==nums.length){
            for(int i=0;i<nums.length;i++){
                maxn=Math.max(maxn,nums[i]);
          }
          return maxn;
        }
        else{
            if(map.get(nums[nums.length-1])==1 && map.get(nums[0])==1){
                return Math.max(nums[nums.length-1],nums[0]);
            }
            else if(map.get(nums[nums.length-1])==1 && map.get(nums[0])!=1){
                return nums[nums.length-1];
            }
            else if(map.get(nums[nums.length-1])!=1 && map.get(nums[0])==1){
                return nums[0];
            }
            
        }
        return -1;
    }
}