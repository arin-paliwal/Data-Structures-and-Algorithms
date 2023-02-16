package Tree;

// 104. Maximum Depth of Binary Tree
public class max_depth_of_tree {
    if(root==null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+Math.max(lh,rh);
}
