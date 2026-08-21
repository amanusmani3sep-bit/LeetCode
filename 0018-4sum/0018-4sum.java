class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lb=new ArrayList<>();
        int i=0;
        while(i<nums.length-3){
            int j=i+1;
            while(j<nums.length-2){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                   List<Integer> ls=new ArrayList<>();
                   long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                          ls.add(nums[i]);
                          ls.add(nums[j]);
                          ls.add(nums[k]);
                          ls.add(nums[l]);
                          lb.add(new ArrayList<>(ls));
                          k+=1;
                          l-=1;
                          while(k<nums.length && nums[k]==nums[k-1]){
                            k+=1;
                          }
                          while(l>0 && nums[l]==nums[l+1]){
                            l-=1;
                          }
                    }
                    else if(sum<target){
                        k+=1;
                    }
                    else if(sum>target){
                        l-=1;
                    }
                }
                j+=1;
                while(j<nums.length && nums[j]==nums[j-1]){
                            j+=1;
                          }
            }
            i+=1;
            while(i>0 && i<nums.length && nums[i]==nums[i-1]){
                            i+=1;
                          }
        }
        return lb;
    }
}