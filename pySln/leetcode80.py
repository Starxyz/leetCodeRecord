class Solution:
    def removeDuplicates(self, nums) -> int:
        if len(nums) < 3:
            return len(nums)
        slow = 1
        fast = 2
        while fast < len(nums):
            if nums[fast] != nums[slow-1]:
                slow += 1
                nums[slow] = nums[fast]
            fast += 1

        return slow+1




sln = Solution()
nums = [1, 1, 1, 2, 2, 3]
res = sln.removeDuplicates(nums)
print(nums[:res])
