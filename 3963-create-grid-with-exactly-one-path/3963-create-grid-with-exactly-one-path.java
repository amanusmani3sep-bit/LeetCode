class Solution {
    public String[] createGrid(int m, int n) {
        int i=0;
        String s="";
        String arr[] =new String[m];
       
        while(i<m){
            int j=0;
            s="";
            while(j<n){
              if(i+1>n-1){
                 if(j==n-1){
                    s=s+".";
                 }
                 else{
                    s=s+"#";
                 }
              }
              else{
                if(j==i || j==i+1){
                    s=s+".";
                }
                else if(j>i+1 && i==m-1){
                    s=s+".";
                }
                else{
                    s=s+"#";
                }
              }
              j=j+1;
            }
            arr[i]=s;
            i+=1;
        }
        return arr;
    }
}