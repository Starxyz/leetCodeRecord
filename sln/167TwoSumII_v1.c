/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
*/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int len = nums.size();
        vector<int> index(2);
        for (int i = 0; i < len; i++) {
            int temp = target - nums[i];
            index[1] = binarySearch(nums, i + 1, temp);
            if (index[1]) {
                index[0] = i + 1;
                index[1]++;
                break;
            }
        }
        return index;
        
    }
private:
    int binarySearch(vector<int>& nums, int low, int target) {
        int high = nums.size() - 1;
        
        while (low <= high) {//[low,high]
            int mid = low + (high - low) / 2;
            if (nums[mid] < target)
                low = mid + 1;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                return mid;                
        }
        return NULL;
    }
};