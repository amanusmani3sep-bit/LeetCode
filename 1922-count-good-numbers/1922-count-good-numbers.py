class Solution:
    def countGoodNumbers(self, n: int) -> int:
        mod=1000000007
        if(n%2==0):
            ans=(self.pow(5,n//2) * self.pow(4,n//2))%mod
        elif(n%2!=0):
            ans = (self.pow(5,(n//2)+1) *self.pow(4,n//2))%mod
        
        return ans
        
    def pow(self,n,p):
        mod=1000000007
        if(p==0):
            return 1
        
        ans=self.pow((n*n)%mod,p>>1)
        if((p&1)==1):
            ans=(ans*n)%mod
        
        return ans
# class Solution: 
#     def countGoodNumbers(self, n: int) -> int:
#         MOD = 1000000007

#         if n % 2 == 0: 
#             ans = (self.pow(5, n//2) * self.pow(4, n//2)) % MOD
#         else: 
#             ans = (self.pow(5, n//2 + 1) * self.pow(4, n//2)) % MOD
        
#         return ans
         
#     def pow(self, n, p):
#         MOD = 1000000007

#         if p == 0: 
#             return 1
        
#         ans = self.pow((n * n) % MOD, p >> 1)

#         if (p & 1) == 1:
#             ans = (ans * n) % MOD
        
#         return ans