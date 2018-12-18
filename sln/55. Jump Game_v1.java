class Solution {
    public boolean canJump(int[] nums) {
        
        int reachable = 0;
        int i = 0;
        
        for (; i < nums.length && i <= reachable; i++) {
            reachable = Math.max(nums[i] + i, reachable);
            if (reachable >= nums.length - 1) return true;
        }
        
        return false;
    }
}