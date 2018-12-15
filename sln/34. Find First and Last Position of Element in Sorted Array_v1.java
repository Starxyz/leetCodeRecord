class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = -1;
        int last = -1;
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break;  
            }
        }
        // if there is only one target in nums, we can re-access it, 
        // because the above breaking didn't execute i++
        for (; i < nums.length; i++) {
            if (nums[i] == target) {
                last = i;
            }
            if (nums[i] > target) {
                break;
            }
        }

        return new int[] {first, last};
    }
    
}