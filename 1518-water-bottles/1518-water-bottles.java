class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int s=numBottles;
        int r=numBottles;
        // s=s+r;
        // if(r>=numExchange){
        //   r=r/numExchange;
        // }
        // s=s+r;
        // return s;
        // int s=numBottles;
        // int r=numBottles;

        while(r>=numExchange){
            s=s+(r/numExchange);
            r=r-(r/numExchange)*numExchange+(r/numExchange);
        }
        return s;
    }
}