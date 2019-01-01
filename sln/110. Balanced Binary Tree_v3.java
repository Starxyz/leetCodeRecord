/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        
        return maxDepth(root) != -1;
    }
    
    private int maxDepth(TreeNode root) {
        
        if (root == null) return 0;
        int L = maxDepth(root.left);
        if (L == -1) return -1;
        
        int R = maxDepth(root.right);
        if (R == -1) return -1;
        
        return (Math.abs(L - R) <= 1) ? (Math.max(L, R) + 1) : -1;
    }
}