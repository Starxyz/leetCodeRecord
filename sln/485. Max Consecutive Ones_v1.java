/*485. Max Consecutive Ones
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
}
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int[] res = new int[2];// bucket calculate
        int temp = res[0];
        int count = res[1];
        for (int i = 0; i < nums.length; i++) {
            res[nums[i]]++;
            if (temp != res[0]) {
                temp = res[0];
                if (res[1] > count) count = res[1];     
                res[1] = 0;
            }
        }

        return res[1] > count ? res[1] : count;
    }
}
// [1,0,1,1] this case only update count once, so we must handle 
// [1] this case we won't update count, we must handle, too.