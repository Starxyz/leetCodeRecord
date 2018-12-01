/* 77. Combinations
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

Example:

Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        res.clear();
        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }
        
        vector<int> c;
        generateCombinations(n, k, 1, c);
        
        return res;
    }
private:
    vector< vector<int> > res;
    // c(n,k)
    void generateCombinations(int n, int k, int start, vector<int>& c) {
        if (c.size() == k) {
            res.push_back(c);
            return;
        }
        
        for (int i = start; i <= n; i++) {
            c.push_back(i);
            generateCombinations(n, k, i+1, c);
            c.pop_back();
        }
        
        return;
    }
};