class Solution:
    def removeDuplicates(self, nums) -> int:
        l = 0
        for i in nums[1:]:
            if i != nums[l]:
                l += 1
                nums[l] = i

        return l + 1


sln = Solution()
test = [1, 1, 2]
res = sln.removeDuplicates(test)
print(test[:res + 1])
