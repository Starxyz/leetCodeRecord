from leetcode80 import Solution

sln = Solution()


def test_case0():
    nums = [1, 1, 1, 2, 2, 3]
    res = sln.removeDuplicates(nums)
    assert [1, 1, 2, 2, 3] == nums[:res]

def test_case1():
    nums = [0, 0, 1, 1, 1, 1, 2, 3, 3]
    res = sln.removeDuplicates(nums)
    assert [0,0,1,1,2,3,3] == nums[:res]

def test_case2():
    pass