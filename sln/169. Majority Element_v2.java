class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];// Moore voting algorithm
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cnt == 0) {
                cnt++;
                major = nums[i];
            }
            else if (major == nums[i])
                cnt++;
            else 
                cnt--;
        }
        
        return major;
    }
}