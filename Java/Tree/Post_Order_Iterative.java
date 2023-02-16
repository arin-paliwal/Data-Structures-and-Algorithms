package Tree;
import Tree.TreeNode;
import java.util.Collection;
List<Integer> Post_Order_Iterative(TreeNode root) {
    // Iterative (using 2 stack)
    Stack<TreeNode> s1=new Stack<TreeNode>();
    Stack<TreeNode> s2=new Stack<TreeNode>();
    List<Integer> result=new ArrayList<Integer>();
    if (root==null) return result;
    s1.add(root);
    while(!s1.isEmpty()){
        root=s1.pop();
        s2.add(root);
        if(root.left!=null)
        s1.add(root.left);
        if(root.right!=null)
        s1.add(root.right);
    }
    while(!s2.isEmpty())
    result.add(s2.pop().val);
    return result;
}}
