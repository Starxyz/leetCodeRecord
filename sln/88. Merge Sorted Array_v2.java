class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
            if (n < 1) return;
            int k = 0;
            for (int i = m; i < m + n; i++)
            {
                nums1[i] = nums2[k++];
            }
            // insertion sort
            for (int i = 1; i < m + n; i++)
            {
                int temp = nums1[i];
                int j = i - 1;
                for (; j >= 0 && nums1[j] > temp; )
                {
                    nums1[j + 1] = nums1[j];
                    j--;
                }
                nums1[j + 1] = temp;
            }
    }
    
    private void swap(int[] a, int i, int k) {
        int temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}