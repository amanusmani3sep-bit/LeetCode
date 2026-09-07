class Solution {
    public int minBitFlips(int start, int goal) {
        int n=(int)(Math.max(Math.log(start)/Math.log(2)+1,Math.log(goal)/Math.log(2)+1));
        int temp=goal;
        int c=0;
        while(n>0){
            if((start&1)!=(temp&1)){
               c+=1;
            }
            start=start>>1;
            temp=temp>>1;
            n=n-1;
        }
        return c;
    }
}