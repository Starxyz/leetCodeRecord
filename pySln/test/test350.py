from leetcode350 import Solution


sln = Solution()

def test_case0():
    nums1 = [1, 2, 2, 1]
    nums2 = [2, 2]
    assert sln.intersect(nums1, nums2) == [2, 2]


def test_case1():
    nums1 = [4, 9, 5]
    nums2 = [9, 4, 9, 8, 4]
    assert sln.intersect(nums1, nums2) == [4, 9]
