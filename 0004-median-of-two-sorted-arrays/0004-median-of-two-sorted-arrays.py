class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1=nums1+nums2
        nums1.sort()
        a=0
        i=0
        j=len(nums1)
        if(len(nums1)%2!=0):
            i=len(nums1)//2
            a=float(nums1[i])
        elif((len(nums1))%2==0):
            i=len(nums1)//2-1
            j=len(nums1)//2
            a=(nums1[i]+nums1[j])/2
            a=float(a)
        return a