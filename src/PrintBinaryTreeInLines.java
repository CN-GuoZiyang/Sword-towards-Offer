import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTreeInLines {

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int line = 1;
        int nextLine = 0;
        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < line; i ++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                    nextLine ++;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    nextLine ++;
                }
            }
            res.add(list);
            line = nextLine;
            nextLine = 0;
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
