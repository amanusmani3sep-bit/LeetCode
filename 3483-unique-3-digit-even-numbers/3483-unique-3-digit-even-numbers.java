class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uni=new HashSet<>();
        //  ArrayList<Integer> uni=new ArrayList<>();
         for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                continue;
            }
            for(int j=0;j<digits.length;j++){
                if(i==j){
                   continue;
                }
                for(int k=0;k<digits.length;k++){
                    if(i==k || j==k){
                        continue;
                    }
                    int p=digits[i]*100+digits[j]*10+digits[k];
                    if(p%2==0){
                      uni.add(p);
                    }
                }
            }
         }
         
         System.out.println(uni);
         return uni.size();

    }
    // public ArrayList<> total(ArrayList<> a,int i,ArrayList<> b){
    //        if(i==3){
    //         if(a%2==0){
    //             return a;
    //         }
    //         return;
    //        }
    //        p=a.get()

    // }
}