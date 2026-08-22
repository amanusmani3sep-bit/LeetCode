class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int temp=n;
        while(temp>0){
            int rem=temp%10;
            sum=sum+rem;
            pro=pro*rem;
            temp=temp/10;
        }
        if(n%(pro+sum)==0){
            return true;
        }
        return false;
    }
}