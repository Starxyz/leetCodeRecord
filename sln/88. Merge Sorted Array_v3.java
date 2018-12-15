class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j = m - 1;
        int k = n - 1;
        int x = m + n - 1;
        
        while (j >= 0 && k >= 0) {
            if (nums1[j] > nums2[k]) nums1[x--] = nums1[j--];
            else nums1[x--] = nums2[k--];
        }
        // if k = 0, we don't need to compare anymore
        while (k >= 0) nums1[x--] = nums2[k--];
    }
}
