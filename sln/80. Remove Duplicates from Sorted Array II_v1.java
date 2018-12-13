class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length < 3) return nums.length;
        
        int k = 2;
        // we don't need to care about nums[0...2]
        for (int i = 2; i < nums.length; i++) {
            if (nums[k-2] != nums[i]) {
                nums[k++] = nums[i];
            }
        }
        
        return k;
    }
}