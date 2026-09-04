class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        t=[]
        m=[]
        t.append(nums[0])
        m.extend(nums[0:len(nums)])
        i=0
        while i<len(nums)-1:
            if(max(t)-min(m)<=k):
                return i
            m.pop(0)
            i+=1
            t.append(nums[i])
        if(max(t)-min(m)<=k):
                return i
        return -1