package Tree;
import Tree.TreeNode;
import java.util.Collection;
public class Level_Order_Iterative {
    Queue<TreeNode>queue=new LinkedList<TreeNode>();
        List<List<Integer>> list=new LinkedList<List<Integer>>();
        if(root==null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer>sublist=new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                sublist.add(queue.poll().val);
            }
            list.add(sublist);
        }
        return list;
}
