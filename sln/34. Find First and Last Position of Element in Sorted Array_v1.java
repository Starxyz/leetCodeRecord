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
       // i = i == nums.length - 1 ? i : ++i;
        for (; i < nums.length; i++) {
            if (nums[i] == target) {
                last = i;
            }
        }

        return new int[] {first, last};
    }
}