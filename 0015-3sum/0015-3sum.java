// class Solution {
//     public List<List<Integer>> threeSum(int[] arr) {
//          List<List<Integer>> m=new ArrayList<>();
//          int i=0;
//          while(i<arr.length){
//             int target=arr[i];
//             HashMap<Integer,Integer> map=new HashMap<>();
//             int j=i+1;
//             while(j<arr.length){
//                 List<Integer> l=new ArrayList<>();
//                 l.add(target);
//                 int need=-target-arr[j];
//                 if(map.containsKey(need)){
//                     l.add(need);
//                     l.add(arr[j]);
//                     m.add(new ArrayList<>(l));
//                 }
//                 else{
//                     map.put(arr[j],1);
//                 }
//                 j+=1;
               
//             }
//             i+=1;
//             while(i<arr.length){
//                 if(arr[i]==arr[i-1]){
//                     i+=1;
//                 }
//                 else{
//                     break;
//                 }
//             }
//          }   
//          return m;
//     }
// }
// class Solution {
//     public List<List<Integer>> threeSum(int[] arr) {

//         List<List<Integer>> m = new ArrayList<>();

//         Arrays.sort(arr);

//         for (int i = 0; i < arr.length - 2; i++) {

//             if (i > 0 && arr[i] == arr[i - 1]) {
//                 continue;
//             }

//             HashMap<Integer, Integer> map = new HashMap<>();

//             for (int j = i + 1; j < arr.length; j++) {

//                 int need = -arr[i] - arr[j];

//                 if (map.containsKey(need)) {

//                     List<Integer> l = new ArrayList<>();
//                     l.add(arr[i]);
//                     l.add(need);
//                     l.add(arr[j]);

//                     m.add(l);

//                     while (j + 1 < arr.length && arr[j] == arr[j + 1]) {
//                         j++;
//                     }
//                 }

//                 map.put(arr[j], 1);
//             }
//         }

//         return m;
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < arr.length; j++) {

                int need = -arr[i] - arr[j];

                if (map.containsKey(need)) {

                    List<Integer> l = new ArrayList<>();
                    l.add(arr[i]);
                    l.add(need);
                    l.add(arr[j]);

                    // Triplet ke andar order matter na kare
                    Collections.sort(l);

                    set.add(l);
                }

                map.put(arr[j], 1);
            }
        }

        ans.addAll(set);

        return ans;
    }
}