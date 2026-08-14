class Solution {
    public int maximumLengthSubstring(String s) {
        int j=0;
        int maxl=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
                    map.put(s.charAt(j),map.get(s.charAt(j))-1);
                    if(map.get(s.charAt(j))==0){
                        map.remove(s.charAt(j));
                    }
                    j+=1;
            }
            maxl=Math.max(maxl,i-j+1);

        }
        return maxl;
    }
}