class Solution {
    public double myPow(double x, int n) {
        if( x==1){
            return x;
        }
        long N=n;
        if(N<0){
            N=-N;
            x=1/x;
            return pow(x,N,1);
        }
        return pow(x,N,1);
        
    }
    public double pow(double x,long n,double ans  ){
        if(n==0){
            return ans;

        }
        if((n&1)==1){
            ans=ans*x;
        }

        x=x*x;
        n=n>>1;
        return pow(x,n,ans);

        
    }
}