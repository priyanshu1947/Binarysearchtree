class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    private int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        return bstFromPreorderHelper(preorder, Integer.MAX_VALUE);
    }

    private TreeNode bstFromPreorderHelper(int[] preorder, int bound) {
        if (index == preorder.length || preorder[index] > bound) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index++]);
        root.left = bstFromPreorderHelper(preorder, root.val);
        root.right = bstFromPreorderHelper(preorder, bound);

        return root;
    }

    // Utility function to perform an in-order traversal of the tree
    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] preorder = {8, 5, 1, 7, 10, 12};
        TreeNode root = solution.bstFromPreorder(preorder);

        System.out.println("In-order traversal of the constructed BST:");
        inOrderTraversal(root);
    }
}
