/*283. Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
}
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            } else if (k > 0) {
                nums[i-k] = nums[i];
                nums[i] = 0;
            } 
        }
    }
}
// example [0,1,0,3,12]
// loop0: i=0; k=1;                          [0,1,0,3,12]
// loop1: i=1; nums[1-1]=nums[1]; nums[1]=0; [1,0,0,3,12] 
// loop2: i=2; k=2;                          [1,0,0,3,12] 
// loop3: i=3; nums[3-2]=nums[3]; nums[3]=0; [1,3,0,0,12]
// loop4: i=4; nums[4-2]=nums[4]; nums[4]=0; [1,3,0,12,0]