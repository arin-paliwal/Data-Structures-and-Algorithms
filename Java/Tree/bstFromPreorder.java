import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class bstFromPreorder { // using inorder & preorder conversion
    int curr = 0;
    int left, right;
    TreeNode head = null;
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode bstFromPreorder(int[] preorder) {
        left = 0;
        right = preorder.length;
        int[] inorder = new int[preorder.length];
        for (int i = 0; i < preorder.length; i++)
            inorder[i] = preorder[i];
        Arrays.sort(inorder);
        for (int i = 0; i < preorder.length; i++)
            map.put(preorder[i], i);
        helper(preorder, left, right);
        return head;
    }

    public TreeNode helper(int[] preorder, int left, int right) {
        if (left >= right)
            return null;
        TreeNode root = new TreeNode(preorder[curr]);
        curr++;
        if (head == null)
            head = root;
        int index = map.get(root.val);
        root.left = helper(preorder, left, index);
        root.right = helper(preorder, index + 1, right);
        return root;
    }
}