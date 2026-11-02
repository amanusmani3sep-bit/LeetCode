class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int[] arr=new int[nums2.length];
      HashMap<Integer,Integer> map=new HashMap<>();
      Stack<Integer> s=new Stack<>();
      for(int i=nums2.length-1;i>=0;i--){
             
             while((!s.isEmpty()) && s.peek()<nums2[i]){
                s.pop();
             }

             if(s.isEmpty()){
                arr[i]=-1;
             }
             else{
                arr[i]=s.peek();
             }
             s.push(nums2[i]);
      }
      
      for(int i=0;i<nums2.length;i++){
          map.put(nums2[i],arr[i]);
        }
      for(int i=0;i<nums1.length;i++){
         nums1[i]=map.get(nums1[i]);
      }
      return nums1;
    }
}