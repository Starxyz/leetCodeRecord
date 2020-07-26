from leetcode35 import Solution

sln = Solution()


def test_case0():
    nums = [1, 3, 5, 6]
    target = 5
    assert 2 == sln.searchInsert(nums, target)


def test_case1():
    nums = [1, 3, 5, 6]
    target = 2
    assert 1 == sln.searchInsert(nums, target)


def test_case2():
    nums = [1, 3, 5, 6]
    target = 7
    assert 4 == sln.searchInsert(nums, target)


def test_case3():
    nums = [1, 3, 5, 6]
    target = 0
    assert 0 == sln.searchInsert(nums, target)


def test_case4():
    nums = [1]
    target = 1
    assert 0 == sln.searchInsert(nums, target)
