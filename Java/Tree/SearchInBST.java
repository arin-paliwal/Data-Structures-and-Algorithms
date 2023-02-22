package Tree;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int value) {
        if (root == null || root.val == value)
            return root;
        if (root.val > value)
            return searchBST(root.left, value);
        else if (root.val < value)
            return searchBST(root.right, value);
        else
            return null;
    }
}