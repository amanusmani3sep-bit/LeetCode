// class Solution {
//     public int[] decrypt(int[] code, int k) {
//       int[] req=new int[code.length];
//      for(int i=0;i<code.length;i++){
//         if(k<0){
//              req[i]=sumback(i,k,code);
//         }
//         else if(k>0){
//             req[i]=sum(i,k,code);
//         }
//         else{
//             req[i]=0;
//         }
//      }
//      return req;
//     }
//     public int sum(int i,int k,int[] code){
        
//         int sum=0;
//          while(k>0){
//             i=(i+1)%code.length;
//             sum=sum+code[i];
//             k=k-1;
//          }
//          return sum;
//     }
//     public int sumback(int i,int k,int[] code){
//         k=-k;
//         int sum=0;
//          while(k>0){
//             i = (i - 1 + code.length) % code.length;
//             sum=sum+code[i];
//             k=k-1;
//          }
//          return sum;
//     }
// }
class Solution {
    public int[] decrypt(int[] code, int k) {
        int N = code.length;
        int[] res = new int[N];
        
        for (int i = 0; i < N; i++) {
            if (k > 0) {
                for (int j = i + 1; j < i + 1 + k; j++) {
                    res[i] += code[j % N];
                }
            } else if (k < 0) {
                for (int j = i - 1; j > i - 1 - Math.abs(k); j--) {
                    res[i] += code[((j % N) + N) % N];
                }
            }
        }
        
        return res;
    }
}