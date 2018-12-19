class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int l = 0;
        int r = nums.length - 1;
        
        while (l < r) {
            int mid = l + (r-l) / 2;
            int n = mid ^ 1;
            if (nums[mid] == nums[n]) l = mid + 1;
            else r = mid;
        }
        
        return nums[l];
    }
}