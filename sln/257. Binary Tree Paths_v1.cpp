/*257. Binary Tree Paths
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> res;
        if (root == NULL) {
            return res;
        }
        
        if (root->left == NULL && root->right == NULL) {
            res.push_back(to_string(root->val));
            return res;
        }
        
        vector<string> leftStr = binaryTreePaths(root->left);
        for (int i=0; i < leftStr.size(); i++) {
            res.push_back(to_string(root->val) + "->" + leftStr[i]);
        }
        vector<string> rightStr = binaryTreePaths(root->right);
        for (int i=0; i < rightStr.size(); i++) {
            res.push_back(to_string(root->val) + "->" + rightStr[i]);
        }
        
        return res;
    }
};