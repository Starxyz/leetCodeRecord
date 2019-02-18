class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;// nums.length > 1
        for (int i = 1; i < nums.length; i++)
            res[i] = res[i-1] * nums[i-1];// calculate product before nums[i]
        
        int right = 1;
        for (int i = nums.length-1; i >= 0; i--) {// calculate product behind nums[i]
            res[i] *= right;
            right *= nums[i];
        }
        
        return res;
    }
}