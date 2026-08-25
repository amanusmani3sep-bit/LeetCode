class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        p=k
        a=1
        for i in range(len(nums)):
          p=k*a
          if(p not in nums):
            return p
          a=a+1
        return k*a
        