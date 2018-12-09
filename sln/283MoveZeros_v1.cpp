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
//space:O(n)
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int> nonZeroElem;
        
        for (int i=0; i < nums.size(); i++) {
            if (nums[i])
                nonZeroElem.push_back(nums[i]);//store all nonzero elements
        }
        
        for (int i=0; i < nonZeroElem.size(); i++) {
            nums[i] = nonZeroElem[i];//move nonzero to the left
        }
        
        for (int i = nonZeroElem.size(); i < nums.size(); i++) {
            nums[i] = 0;//set zero 
        }
    }
};