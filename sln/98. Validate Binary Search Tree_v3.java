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
    
    private TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        
        prev = null;        
        return isMonotonicIncreasing(root);
    }
    
    private boolean isMonotonicIncreasing(TreeNode p) {
        
        if (p == null) return true;
        
        if (isMonotonicIncreasing(p.left)) {
            if (prev != null && p.val <= prev.val) return false;
            prev = p;
            return isMonotonicIncreasing(p.right);
        }
        
        return false;
        
    }
}