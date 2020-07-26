class Solution:
    def removeElement(self, nums, val: int) -> int:
        l = 0
        for i in nums:
            if i != val:
                nums[l] = i
                l += 1

        return l


class Solution1:
    def removeElement(self, nums, val: int) -> int:
        l = 0
        r = len(nums)
        while l < r:
            if nums[l] == val:
                r -= 1
                while nums[r] == val and l < r: 
                    r -= 1

                nums[l], nums[r] = nums[r], nums[l]
            else:
                l += 1
        return l


# Todo
"""
因为元素的位置可以改变，所以可以考虑使用swap减少不必要的赋值
"""
sln = Solution1()
nums = [1, 2, 3, 5, 4]
res = sln.removeElement(nums, 4)
print(nums[:res])
