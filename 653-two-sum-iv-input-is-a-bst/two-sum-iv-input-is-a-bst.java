/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> ls = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        if(ls.contains(k-root.val)) return true;
        ls.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}