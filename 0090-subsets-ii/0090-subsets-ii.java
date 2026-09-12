class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>(subset(nums,0,new ArrayList<>()));
        return ans;
    }
    public HashSet<List<Integer>> subset(int[] nums,int i,List<Integer> k ){
        if(i==nums.length){
          HashSet<List<Integer>> l=new HashSet<>();
          l.add(new ArrayList<>(k));
          return l;
        }
        HashSet<List<Integer>> left=new HashSet<>();
        HashSet<List<Integer>> right=new HashSet<>();
        k.add(nums[i]);
        left=subset(nums,i+1,k);
        k.remove(k.size()-1);
        right=subset(nums,i+1,k);
        left.addAll(new ArrayList<>(right));
        return left;
    }
}