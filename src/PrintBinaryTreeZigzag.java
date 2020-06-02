import java.util.ArrayList;
import java.util.Stack;

public class PrintBinaryTreeZigzag {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<>();
        if(pRoot == null) return res;
        Stack<TreeNode> s0 = new Stack<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> cur = s0;
        cur.push(pRoot);
        while(!cur.isEmpty()) {
            ArrayList<Integer> line = new ArrayList<>();
            while(!cur.isEmpty()) {
                TreeNode n = cur.pop();
                if(n == null) continue;
                line.add(n.val);
                if(cur == s0) {
                    s1.push(n.left);
                    s1.push(n.right);
                } else {
                    s0.push(n.right);
                    s0.push(n.left);
                }
            }
            cur = (cur == s0?s1:s0);
            res.add(line);
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
