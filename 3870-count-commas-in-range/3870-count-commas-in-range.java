class Solution {
    public int countCommas(int n) {
        int sum=0;
        if(n>=1000 && n<=100000){
            int temp=1000;
            
            // while(n-temp>0){
            //     sum=sum+n-temp+1;
            //     temp=temp*10;
            // }
            return n-temp+1;
            
        }
        else{
            return 0;
        }
    }
}