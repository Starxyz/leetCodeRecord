from leetcode27 import Solution, Solution1

# sln = Solution()
sln = Solution1()


def test_case0():
    nums = [3, 2, 2, 3]
    val = 3
    assert [2, 2] == nums[:sln.removeElement(nums, val)]


def test_case1():
    nums = [0, 0]
    val = 0
    assert [] == nums[:sln.removeElement(nums, val)]

def test_case2():
    nums = [1, 2, 3, 5, 4]
    val = 4
    res = nums[:sln.removeElement(nums, val)]
    print(res)
    assert [1, 2, 3, 5] == res
