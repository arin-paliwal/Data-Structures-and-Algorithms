public class same_tree {
    
}/**
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        tree(p,list);
        tree1(q,list2);
        if (list.size()!=list2.size())
        return False;
        for(int i=0;i<list.size();i++){
            if (list.get(i)!=list2.get(i))
            return False;
        }
        return True;
    }
    public void tree(TreeNode root,List<Integer> list){
        if (root==null)
        return;
        tree(root.left,list);
        tree(root.right,list);
        list.add(root.val);
    }

    public void tree1(TreeNode root,List<Integer> list2){
        if (root==null)
        return;
        tree(root.left,list);
        tree(root.right,list);
        list2.add(root.val);
    }
}