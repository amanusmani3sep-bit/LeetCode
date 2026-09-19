class Solution:
    def countAndSay(self, n: int) -> str:
        l=""
        s=""
        count=1
        for j in range(n):
            count=1
            if(j==0):
                l="1"
            else:
             for i in range(len(l)):
               if(i<len(l)-1 and l[i]==l[i+1]):
                  count+=1
               elif(i==len(l)-1 and l[i]!=l[i-1]):
                     s=s+str(count)+l[i]
                     count=1
               else:
                 s=s+str(count)+l[i]
                 count=1
             l=s
             s=""
        return l