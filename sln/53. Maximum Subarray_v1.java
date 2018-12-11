class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int max1 = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            max1 = Math.max(max1 + nums[i], nums[i]);// 如果max返回的是max1+nums[i],代表是一个连续的子列，否则就是只有一个nums[i]
            max = Math.max(max, max1);
        }
        return max;
    }
}