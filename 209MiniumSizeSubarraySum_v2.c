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
        int len = nums.size() ;
        vector<int> sums(len + 1, 0);
        int minLen = len + 1;
        for (int i = 1; i < len + 1; i++) {
            sums[i] = sums[i-1] + nums[i-1];//example: nums=[1,2,3];sums=[0,1,3,6]
        }
        
        for (int i = 1; i < len + 1; i++) {
            if (sums[i] >= s) {
                int left = binarySearch(0, i, sums[i] - s, sums);
                if (left != -1)
                    minLen = min(minLen, i - left + 1);//i - p + 1 means the width
            }
        }
        return minLen == len + 1 ? 0 : minLen;
    }
    
private:
    /*find elem > sums[i] - s, return elem's index*/
    int binarySearch(int l, int r, int key, vector<int>& sums) {
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (sums[mid] <= key)
                l = mid + 1;
            else
                r = mid;
        }
        return sums[r] > key ? r : -1;
    }
};