class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int[] arr=new int[nums2.length];
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
      System.out.println(Arrays.toString(arr));
      for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
             if(nums1[i]==nums2[j]){
                nums1[i]=arr[j];
                break;
             }
        }
      }
      return nums1;
    }
}