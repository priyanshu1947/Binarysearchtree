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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        rightview(root, result, 0);
        return result;
        
    }
    public void rightview(TreeNode root, List<Integer> ans , int depth)
    {
        if(root==null)
        return;

        if(depth == ans.size())
        ans.add(root.val);

        rightview(root.right, ans , depth+1);
        rightview(root.left, ans , depth+1);    

    }
}