package Tree;
import java.util.Collection;
import Tree.TreeNode;
public class In_Order_Iterative(TreeNode root) {
    //Iterative Approach
    List<Integer> result=new ArrayList<Integer>();
    Stack<TreeNode> s=new Stack<TreeNode>();
    TreeNode node=root;
    while(true){
        if(node!=null){
            s.push(node);
            node=node.left;
        }
        else{
            if(s.isEmpty())
            break;
            node=s.pop();
            result.add(node.val);
            node=node.right;
        }
    }
    return result;
}
