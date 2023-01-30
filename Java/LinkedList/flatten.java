//114. Flatten Binary Tree to Linked List
import java.util.Collections;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        findPreorder(root, list);
        // ListNode tree=new ListNode(-1);
        TreeNode head = root;
        TreeNode temp = root;
        int i = 1;
        TreeNode N = null;
        while (i < list.size()) {
            temp.left = null;
            TreeNode dummy = new TreeNode(list.get(i));
            i++;
            temp.right = dummy;
            temp = dummy;
        }
        System.out.println(list);
    }

    public void findPreorder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        findPreorder(root.left, list);
        findPreorder(root.right, list);
    }
}