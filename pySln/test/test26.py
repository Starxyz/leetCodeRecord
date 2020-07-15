from leetcode26 import Solution

sln = Solution()


def test_case0():
    nums = [1, 1, 2]
    assert [1, 2] == nums[:sln.removeDuplicates(nums)]


def test_case1():
    nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    assert [0, 1, 2, 3, 4] == nums[:sln.removeDuplicates(nums)]


def test_case2():
    nums = [-1, 0, 0, 0, 0, 3, 3]
    assert [-1, 0, 3] == nums[:sln.removeDuplicates(nums)]


def test_case3():
    nums = list()
    assert [] == nums[:sln.removeDuplicates(nums)]