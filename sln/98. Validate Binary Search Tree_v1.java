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
    public boolean isValidBST(TreeNode root) {
        
        if (root == null) return true;
        return isSubtreeLessThan(root.left, root.val)
            && isSubtreeGreaterThan(root.right, root.val)
            && isValidBST(root.left)
            && isValidBST(root.right);
    }
    
    private boolean isSubtreeLessThan(TreeNode p, int val) {
        
        if (p == null) return true;
        return p.val < val
            && isSubtreeLessThan(p.left, val)
            && isSubtreeLessThan(p.right, val);
    }
    
    private boolean isSubtreeGreaterThan(TreeNode p, int val) {
        
        if (p == null) return true;
        return p.val > val
            && isSubtreeGreaterThan(p.left, val)
            && isSubtreeGreaterThan(p.right, val);
    }
}