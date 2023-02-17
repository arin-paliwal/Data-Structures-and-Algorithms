package Tree;

import Tree.TreeNode;
import java.util.Collection;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // Iterative using 1 stack
        List<Integer> postO = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode cur = root, temp;
        while (cur != null || !st.isEmpty()) {
            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                temp = st.peek().right;
                if (temp == null) {
                    temp = st.pop();
                    postO.add(temp.val);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.pop();
                        postO.add(temp.val);
                    }
                } else
                    cur = temp;
            }
        }
        return postO;
    }
}