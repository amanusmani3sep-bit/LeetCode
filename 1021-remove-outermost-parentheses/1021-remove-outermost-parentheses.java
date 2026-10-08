class Solution {
    public String removeOuterParentheses(String s) {
        int bal=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bal>0){
                 sb.append(s.charAt(i));
                }
              bal+=1;
            }
            else{
                  bal-=1;
                  if(bal>0){
                    sb.append(s.charAt(i));
                  }
            }
            
        }
        return sb.toString();
    }
}