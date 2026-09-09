class Solution {
    public long countCommas(long n) {
        long sum=0;
        if(n>=1000 && n<1000000){
            sum=sum+n-999;
            return sum;
        }
        else if(n>=1000 && n<1000000000){
            sum=sum+(999999-999)+2*(n-999999);
            return sum;
        }
        else if(n>=1000000000 && n<1000000000000L){
            sum=sum+(999999-999)+2*(999999999-999999)+3*(n-999999999);
            return sum;
        }
        else if(n>=1000000000000L && n<1000000000000000L){
            sum=sum+(999999-999)+2*(999999999-999999)+3*(999999999999L-999999999)+4*(n-999999999999L);
            return sum;
        }
        else if(n==1000000000000000L){
            sum=sum+(999999-999)+2*(999999999-999999)+3*(999999999999L-999999999)+4*(n-999999999999L);
            return sum+1;
        }
        return 0;
    }
}