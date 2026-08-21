class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                l.add(index[i],nums[i]);
            }
            int[] target=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                target[i]=l.get(i);
            }
            return target;
    }
}