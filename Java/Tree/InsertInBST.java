// TreeNode root;
class InsertInBST {
    class TreeNode{
        int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
    }
    TreeNode root;
    // public TreeNode insertIntoBST(TreeNode root, int key) {
    //     if(root==null){
    //         TreeNode node=new TreeNode(key);
    //         root=node;
    //         return root;
    //     }
    //     else if(key<root.val)
    //     root.left=insertIntoBST(root.left,key);
    //     else root.right=insertIntoBST(root.right,key);
    //     return root;
    // }

    public void inorder(TreeNode roots){
        if(roots==null) return;
        inorder(roots.left);
        System.out.println(roots.val);
        inorder(roots.right);
    }
    public static void main(String[] args) {
        InsertInBST tree=new InsertInBST();
        tree.root=new TreeNode(4);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(6);
        tree.inorder(tree.root);

    }
    
}
