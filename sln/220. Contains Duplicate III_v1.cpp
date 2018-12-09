/*220. Contains Duplicate III
Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3, t = 0
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1, t = 2
Output: true
Example 3:

Input: nums = [1,5,9,1,5,9], k = 2, t = 3
Output: false

*/
class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        set<long long> record;
        for (int i=0; i<nums.size(); i++) {// 负数减正数也可能溢出
            if (record.lower_bound((long long)nums[i] - (long long)t) != record.end() &&
               *record.lower_bound((long long)nums[i] - (long long)t) <= (long long)nums[i] + (long long)t) {
                return true;
            }
            record.insert(nums[i]);
            if (record.size() == k+1) {// make slide window's size equals to k
                record.erase(nums[i-k]);
            }
        }
        
        return false;
    }
};