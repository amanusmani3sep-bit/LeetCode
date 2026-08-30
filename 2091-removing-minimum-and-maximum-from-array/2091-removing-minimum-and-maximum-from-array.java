class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
       int maxn=Integer.MIN_VALUE;
       int minn=Integer.MAX_VALUE;
       for (int x : nums) {
         maxn = Math.max(maxn, x);
         minn = Math.min(minn, x);
        }
       int count=2;
       int f1=0;
       int b1=0;
       int f2=0;
       int b2=0;
       int i=0;
       while(true){
        if(nums[i]==maxn){
           f1=i+1;
           break;
        }
        i+=1;
       }
       i=0;
       while(true){
        if(nums[i]==minn){
           f2=i+1;
           break;
        }
        i+=1;
       }
       b1=nums.length-f1+1;
       b2=nums.length-f2+1;
    //    if(f1<b1 && f2<b2){
    //     return Math.max(f1,f2);
    //    }
    //    else if(b1<f1 && b2<f2){
    //     return Math.max(b1,b2);
    //    }
    //    else{
    //     return (Math.min(f1,b1)+Math.min(f2,b2));
    //    }
      int m=f1+b2;
      if(m>Math.max(f1,f2)){
        m=Math.max(f1,f2);
      }
      if(m>Math.max(b1,b2)){
        m=Math.max(b1,b2);
      }
      if(m>b1+f2){
        m=b1+f2;
      }
      return m;
    }
}