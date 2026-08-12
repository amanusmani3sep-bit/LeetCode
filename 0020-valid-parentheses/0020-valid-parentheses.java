class Solution {
    public boolean isValid(String s) {
        String s1="({[";
        String s2=")}]";
        int i=0;
        while(i<s.length()-1){
            int index1 = s1.indexOf(s.charAt(i));
            int index2 = s2.indexOf(s.charAt(i + 1));
            if(index1!=-1 && index2!=-1 && index1==index2){
               s=s.substring(0,i)+s.substring(i+2);
               i=-1;
            }
            i+=1;
        }
        System.out.println(s);
        if(s.equals("")){
            return true;
        }
        return false;
    }
}