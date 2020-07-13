class Solution:
    def intersect(self, nums1, nums2):
        n1 = len(nums1)
        n2 = len(nums2)

        res = []

        for i1, x1 in enumerate(nums1):
            for i2, x2 in enumerate(nums2):
                if x1 == x2:
                    res.append(x1)
                    nums2.pop(i2)
                    break
        return res