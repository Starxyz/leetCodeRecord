/*145. Binary Tree Postorder Traversal
Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]
Follow up: Recursive solution is trivial, could you do it iteratively?
 */
struct Command {
    string s;   //"go", "print"
    TreeNode* node;
    Command(string s, TreeNode* node) : s(s), node(node){}
};

class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
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
                stack.push(Command("print", command.node));// first in last out
                
                if (command.node->right) {
                    stack.push(Command("go", command.node->right));
                }
                
                if (command.node->left) {
                    stack.push(Command("go", command.node->left));
                }
                
            }
        }
        
        return res;
    }
};