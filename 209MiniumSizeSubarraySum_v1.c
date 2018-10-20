/*
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
Follow up:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 
*/
class Solution {
public:
    int minSubArrayLen(int s, vector<int>& nums) {
        int l = 0;//sliding window
        int r = -1;
        int res = nums.size() + 1;//initial length
        int sum = 0;
        
        while (l < nums.size()) {
            if (sum < s && ++r < nums.size())
                sum += nums[r];               
            else {
                if (res > r - l + 1) {
                    res = r - l + 1;
                }
                sum -=nums[l++];             
            }
        }
        return res == nums.size() + 1 ? 0 : res;
    }
};