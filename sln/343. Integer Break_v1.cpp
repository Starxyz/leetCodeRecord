/*343. Integer Break
Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

Example 1:

Input: 2
Output: 1
Explanation: 2 = 1 + 1, 1 × 1 = 1.
Example 2:

Input: 10
Output: 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
Note: You may assume that n is not less than 2 and not larger than 58.
 */
class Solution {
private:
    vector<int> memo;
    int max3(int a, int b, int c) {
        return max(a, max(b, c));
    }
    int breakInteger(int n) {
        if (n == 1) {
            return 1;
        }
        
        if (memo[n] != -1) {
            return memo[n];
        }
        
        int res = -1;
        for (int i = 1; i < n; i++) {
            res = max3(res, i*(n-i), i*breakInteger(n-i));
        }
        memo[n] = res;
        return res;
    }
public:
    int integerBreak(int n) {
        memo = vector<int>(n+1,-1);
        return breakInteger(n);
    }
};