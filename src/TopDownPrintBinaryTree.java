import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopDownPrintBinaryTree {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node == null) continue;
            res.add(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }
        return res;
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

}
