class Solution:
    def maxArea(self, height: List[int]) -> int:
       i=0
       j=len(height)-1
       maxs=float('-inf')
       area=0
       while i<j and j>0:
        area=min(height[i],height[j])*(j-i)
        maxs=max(area,maxs)
        if(height[i]>height[j]):
            j-=1
        else:
            i+=1
       return maxs
    
   