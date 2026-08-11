              
class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) <= 1:
            return s
        
        Max_Len=1
        Max_Str=s[0]
        for i in range(len(s)-1):
            for j in range(i+1,len(s)):
                if j-i+1 > Max_Len and s[i:j+1] == s[i:j+1][::-1]:
                    Max_Len = j-i+1
                    Max_Str = s[i:j+1]

        return Max_Str
    #    i=0
    #    j=len(s)-1
    #    k=0
    #    p= len(s)-1
    #    while(i<=j):
    #     if(s[i]!=s[j]):
    #         if(i<len(s)-1 and s[i+1]==s[j]):
    #             i+=1
    #             k=i
    #             p=j
    #         else:
    #             j-=1
    #             k=i
    #             p=j        
    #     else:
    #         i+=1
    #         j-=1
    #     t=""
    #     for i in range(k,p+1):
    #        t=t+s[i]
        
    #    return t