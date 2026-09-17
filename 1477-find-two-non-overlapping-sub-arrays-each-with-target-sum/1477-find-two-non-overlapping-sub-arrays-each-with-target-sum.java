// class Solution {
//     public int minSumOfLengths(int[] arr, int target) {
//         int count=0;
//         int sum=0;
//         ArrayList<Integer> s=new ArrayList<>();
//         int i=0;
//         int j=0;
//         while(i<arr.length){
//             sum=sum+arr[i];
//             while(sum>target){
//                 sum=sum-arr[j];
//                 j+=1;
//             }
//             if(sum==target){
//                 count+=1;
//                 s.add(i-j+1);
//                 sum=0;
//                 j=i+1;
//             }
//             i+=1;
//         }
//         System.out.println(s);
//         if(count<=1){
//             return -1;
//         }
//           return min(s);
//     }
//     static int  min(ArrayList<Integer> a){
//         int min1=753165;
//         int min2=753165;
//         int p=-1;
//         for(int i=0;i<a.size();i++){
//             if(a.get(i)<min1){
//                 min1=a.get(i);
//                 p=i;
//             }
//         }
//         for(int i=0;i<a.size();i++){
//             if(i!=p && a.get(i)<min2 && a.get(i)>=min1){
//                 min2=a.get(i);
//             }
//         }
//         return min1+min2;
//     }
// }
class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int[] best = new int[n];

        for (int i = 0; i < n; i++) {
            best[i] = Integer.MAX_VALUE;
        }

        int sum = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            while (sum > target && j <= i) {
                sum -= arr[j];
                j++;
            }

            // Agar current subarray ka sum target hai
            if (sum == target) {

                int len = i - j + 1;

                // Pehle wala subarray j se pehle khatam hona chahiye
                if (j > 0 && best[j - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + best[j - 1]);
                }

                minLength = Math.min(minLength, len);
            }

            // i tak ka minimum subarray store karo
            if (i > 0) {
                best[i] = best[i - 1];
            }

            if (sum == target) {
                best[i] = Math.min(best[i], i - j + 1);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}