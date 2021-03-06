# Given a non-empty array of integers, every element appears twice except for one. Find that single one.

# Note:

# Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

# Example 1:

# Input: [2,2,1]
# Output: 1
# Example 2:

# Input: [4,1,2,1,2]
# Output: 4

def singleNumber(nums: List[int]) -> int:
    res = 0 # 0 xor x = x
    for i in nums:
        res = res ^ i

    return res

# so elegance
def singleNumber2(nums: List[int]) -> int:
    return 2 * sum(set(nums)) - sum(nums)