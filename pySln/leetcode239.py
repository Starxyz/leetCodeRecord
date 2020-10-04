"""
检验边界条件的用例，
[1,-1]
1

[1,3,1,2,0,5]
3
"""
class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        if not nums:
            return []
        
        window = []
        res = []

        for i, x in enumerate(nums):
            # keep window size less than k
            if i >= k and window[0] <= i - k:
                window.pop(0)
            while window and  x >= nums[window[-1]]: # 因为只要x >= 他们， 他们就没有出头之日，所以用大于等于,此处意思是将他们pop干净， 后面window.apppend(i)就是插入在0的位置了
                window.pop()

            window.append(i)
            if i >= k - 1:
                res.append(nums[window[0]])

        return res


