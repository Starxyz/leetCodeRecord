/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/
//time: O(n)
//space:O(1)
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int k = 0;
        
        for (int i=0; i < nums.size(); i++)
            if (nums[i])
                nums[k++] = nums[i];
        for (int i = k; i < nums.size(); i++)
            nums[i] = 0;
    }
};