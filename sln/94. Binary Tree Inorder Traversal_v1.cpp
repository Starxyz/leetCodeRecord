/*94. Binary Tree Inorder Traversal
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
Follow up: Recursive solution is trivial, could you do it iteratively?
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
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
struct Command {
    string s;   //"go", "print"
    TreeNode* node;
    Command(string s, TreeNode* node) : s(s), node(node){}
};

class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        if (root == NULL) {
            return res;
        }
        
        stack<Command> stack;
        stack.push(Command("go", root));
        while (!stack.empty()) {
            Command command = stack.top();
            stack.pop();
            
            if (command.s == "print") {
                res.push_back(command.node->val);
            } else {
                if (command.node->right) {// first in last out
                    stack.push(Command("go", command.node->right));
                }
                stack.push(Command("print", command.node));
                if (command.node->left) {
                    stack.push(Command("go", command.node->left));
                }
                
            }
        }
        
        return res;
    }
};