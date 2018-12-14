class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] res = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < m && k < n) {
            if (nums1[j] > nums2[k]) {
                res[i] = nums2[k];
                i++;
                k++;
            }
            else {
                res[i] = nums1[j];
                i++;
                j++;
            }
        }
        
        while (j < m) {
            res[i] = nums1[j];
            i++;
            j++;
        } 
        while (k < n) {
            res[i] = nums2[k];
            i++;
            k++;
        }
        
        k = 0;
        for (int num : res) nums1[k++] = num;
    }
}