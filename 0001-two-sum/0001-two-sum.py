class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
       f={}
       for i in range(len(nums)+1):
        need=target-nums[i]
        if(need in f):
            return [f[need],i]
        else:
            f[nums[i]]=i

        # mp={}
        # current=0
        # need=0
        # for i in range(len(nums)):
        #    current=nums[i]
        #    need=target-current
        #    if(need in mp):
        #     return [mp[need],i]
        #    else:
        #     mp[nums[i]]=i