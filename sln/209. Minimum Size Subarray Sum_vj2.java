/*209. Minimum Size Subarray Sum
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
Follow up:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 
 */
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int res = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;// sliding windows
        int sum = 0; // all nums[...] is positive
        
        while (r < nums.length) {
            if (sum < s) {
                sum += nums[r];
                while (sum >= s) {
                    res = Math.min(res, r - l + 1);
                    sum -= nums[l++];
                }
                r++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}