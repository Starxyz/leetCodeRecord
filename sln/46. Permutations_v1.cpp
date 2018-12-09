/*46. Permutations
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        res.clear();
        if (nums.size() == 0)
            return res;
        
        used = vector<bool> (nums.size(), false);
        vector<int> p;
        generatePermutation(nums, 0, p);
        
        return res;
    }

private:
    vector<vector<int>> res;
    vector<bool> used;
    void generatePermutation(const vector<int>& nums, int index, vector<int>& p) {
        if (index == nums.size()) {
            res.push_back(p);
            return;
        }
        
        for (int i = 0; i < nums.size(); i++) {
            if (!used[i]) {
                used[i] = true;
                p.push_back(nums[i]);
                generatePermutation(nums, index+1, p);
                p.pop_back();
                used[i] = false;
            }
        }
        
        return;
    }
};