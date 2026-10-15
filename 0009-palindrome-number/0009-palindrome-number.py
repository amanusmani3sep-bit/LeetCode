class Solution:
    def isPalindrome(self, x: int) -> bool:
        x=str(x)
        j=len(x)-1
        i=0
        while(i<j):
            if(x[i]!=x[j]):
               return False
            i=i+1
            j=j-1
        return True
        # x=str(x)
        # return x==x[::-1]