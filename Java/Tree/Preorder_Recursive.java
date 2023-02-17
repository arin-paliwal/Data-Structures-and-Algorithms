package Tree;

class Solution {
        public List<Integer> Preorder_Recursive(TreeNode root) {
            List<Integer> list=new ArrayList<Integer>();
            tree(root,list);
            return list;
        }
        public void tree(TreeNode root,List<Integer> list){
            if (root==null)
            return;
            list.add(root.val);
            tree(root.left,list);
            tree(root.right,list);
        }
    }