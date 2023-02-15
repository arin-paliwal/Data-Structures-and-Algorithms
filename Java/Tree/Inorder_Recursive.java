package Tree;
import java.util.Collection;
import Tree.TreeNode;

public class Inorder_Recursive(TreeNode root) {
    List<Integer> list=new ArrayList<Integer>();
    tree(root,list);
    return list;
}
public void tree(TreeNode root,List<Integer>list){
    if (root==null)
    return;
    tree(root.left,list);
    list.add(root.val);
    tree(root.right,list);
}
