/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return ((p.val < root.val && q.val < root.val) || (p.val > root.val && q.val > root.val)) ?
            lowestCommonAncestor(p.val < root.val ? root.left : root.right, p, q) : root;
    }
}
