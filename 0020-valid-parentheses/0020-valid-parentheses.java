class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
             if(st.size()>0){
                char top=st.pop();
                if(s.charAt(i)==')' && top!='('){
                    return false;
                }
                else if(s.charAt(i)=='}' && top!='{'){
                    return false;
                }
                else if(s.charAt(i)==']' && top!='['){
                    return false;

                }
             }
             else{
                return false;
             }
            }
        }
        return st.isEmpty();
    }
}