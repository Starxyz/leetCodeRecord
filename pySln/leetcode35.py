class Solution:
    def searchInsert(self, nums, target: int) -> int:
        if not nums:
            return

        if target < nums[0]:
            return 0

        l = 0
        r = len(nums) - 1  # [l...r]
        while l <= r:
            mid = l + (r - l) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                l = mid + 1
            else:
                r = mid - 1
        return r + 1


sln = Solution()
nums = [0]
target = 0
res = sln.searchInsert(nums, target)
print(res)
