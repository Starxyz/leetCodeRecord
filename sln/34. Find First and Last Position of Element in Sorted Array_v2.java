class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int p = binarySearch(nums, target);
        if (p == -1) {
            return new int[] {-1, -1};
        }
        
        int first = -1;
        int last = -1;        
        for (int i = p; i >= 0; i--) {
            if (nums[i] == target) {
                first = i;
            }
            else {
                break;
            }
        }
        for (int i = p; i < nums.length; i++) {
            if (nums[i] == target) {
                last = i;
            }
            else {
                break;
            }
        }

        return new int[] {first, last};
    }
    
    private int binarySearch(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;
        
        
        while (l <= r) {
            int mid = l + (r - l) / 2; // [l...mid] [mid+1...r]
            
            if (nums[mid] > val) {
                r = mid - 1; // nums[mid] has been accessd
            } else if (nums[mid] < val) {
                l = mid + 1; // nums[mid] has been accessd
            } else {
                return mid;
            }
        }
        
        return -1;
    }
}