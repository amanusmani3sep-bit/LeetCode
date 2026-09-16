from math import pow
class Solution:
    def reverse(self, x: int) -> int:
        rem=0
        rev=0
        if(x<0):
          x=-x
          while(x!=0):
            rem=x%10
            rev=rev*10+rem
            x=x//10
          rev=-rev 
        else:
            while(x!=0):
              rem=x%10
              rev=rev*10+rem
              x=x//10
        if(rev>pow(2,31)-1 or rev<-(pow(2,31))):
            return 0
        else:
            return rev
       